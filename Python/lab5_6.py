"""
주제:
1. 리스트로 넘어오는 숫자들 중에서 가장 작은 값을 반환하는 min함수를 정의하라.
2. 리스트로 넘어오는 숫자들 중에서 가장 큰 값을 반환하는 max함수를 정의하라.
3. num 변수에 [4,7,9,11,-5] 를 저장한 후, 함수를 호출하여 최소, 최대값을 출력하라.
작성자: 김희수
작성일: 171016
"""

num = [4, 7, 9, 11, -5]

print("최솟값: {}".format(min(num)))
print("최댓값: {}".format(max(num)))


def min(num):
    a = num[0]

    for i in num:
        if(a > i):
            a = i

    return a


def max(num):
    a = num[0]

    for i in num:
        if(a < i):
            a = i

    return a

