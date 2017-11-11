"""
문제:
매개변수로 넘어오는 x번째 피보나치 수를 반환하는 함수 fibo를 정의하라. (0번째부터 시작한다고 가정한다.)

1. 일반 함수로 정의한다. (lab5_9.py)
2. Recursion을 이용하여 다시 정의한다.(lab5_9_recursion.py)
3. 0번째부터 10번째까지의 피보나치 수를 출력한다.

작성자: 김희수
작성일: 17.10.30.
"""
def fibo(n):
    """
    :param n: 피보나치 수열 개수
    :return: n번째 비보나치 수열 값 리턴
    """
    a=1
    b=1
    sum=0

    if(n==0):
        return 0
    elif(n==1 or n==2):
        return 1
    elif(n>2):
        for i in range(1,n-1):
            sum=a+b
            a = b
            b = sum
    return sum

print("자연수를 입력해주세요: ",end="")
num = int(input())

print(fibo(num))

print("0번째부터 10번째까지의 피보나치 수열: [ ",end="")

for i in range(0,11):
    if(i==10):
        print(fibo(i), end=" ]")
    else:
        print(fibo(i), end=", ")
