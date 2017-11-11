package lab8_2;

/*
 * 파일명 : SynchronizedQueue.java
 * 작성일: 2017년 11월 10일
 * 작성자: 김희수
 * 내용: 배열로 구현한 동기화된 원형 큐
 */

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SynchronizedQueue {
	private final Lock lock = new ReentrantLock();
	private final Condition notFull  = lock.newCondition(); 
	private final Condition notEmpty = lock.newCondition(); 
	private int[] array; 
	private int capacity;
	private int front = 0;
	private int rear = 0;
	private int count = 0;
	
	public SynchronizedQueue(int capacity) {
		this.capacity = capacity;
		array = new int[capacity];
	}
	
	public boolean isEmpty() {
		return count == 0;
	}
	
	public boolean isFull() {
		return count == capacity;
	}

	public void enQueue(int item) throws InterruptedException {
		lock.lock();
		try {
			while (isFull()) {
				System.out.println("enQueue : 큐가 가득차서 기다립니다.");
				notFull.await();				
			}
			rear = (rear + 1) % capacity;
			array[rear] = item;
			notEmpty.signal();
			++count;
		} finally {
			lock.unlock();
		}
	}

	public int deQueue() throws InterruptedException {
		lock.lock();
		try {
			while (isEmpty()) {
				System.out.println("\t\tdeQueue : 큐가 비어서 기다립니다.");
				notEmpty.await();
			}
			front = (front + 1) % capacity;
			int item = array[front];
			notFull.signal();
			--count;
			return item;
		} finally {
			lock.unlock();
		}
	}
}

