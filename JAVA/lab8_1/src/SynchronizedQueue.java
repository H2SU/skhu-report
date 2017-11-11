/*
 * ���ϸ� : SynchronizedQueue.java
 * �ۼ���: 17.11.10
 * �ۼ���: �����
 * ����: �迭�� ������ ����ȭ�� ���� ť
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
	
	public SynchronizedQueue(int capacity) {
		this.capacity = capacity; 
		array = new int[capacity]; // ť �ʱ�ȭ
	}
	
	public boolean isEmpty() {
		return front == rear; // front�� rear�� ������ ����ִ� ����
	}
	
	public boolean isFull() { // rear +1�� ��ü�� ���� �� �������� 0�̸� �� ���ִ� ����
		return (rear + 1) % capacity == front;
	}

	public void enQueue(int item) throws InterruptedException {
		lock.lock(); // ���
		try {
			while (isFull()) { // ���������� ���
				System.out.println("enQueue : ť�� �������� ��ٸ��ϴ�.");
				notFull.await(); // notFull ���				
			}
			rear = (rear + 1) % capacity; // ���������ÿ��� �Ǿ�����, �ƴҽ� 1ĭ����
			array[rear] = item; // ���� �־���
			notEmpty.signal(); // notEmpty�� ��ȣ����
		} finally {
			lock.unlock(); // �ൿ�� ������ ���
		}
	}

	public int deQueue() throws InterruptedException {
		lock.lock(); // �ൿ�� ���������� ���
		try {
			while (isEmpty()) { // ��������� ���
				System.out.println("\t\tdeQueue : ť�� �� ��ٸ��ϴ�.");
				notEmpty.await(); // �������� ���
			}
			front = (front + 1) % capacity; // ���������� ���� ������, �ƴ� �� 1����
			int item = array[front]; // item�� ������ ���� ����
			notFull.signal(); // ������� ���°� ���� ���¿��� ��ȣ�� ��
			return item; // ������ �� ����
		} finally {
			lock.unlock(); // �ൿ�� ������ ���
		}
	}
}
