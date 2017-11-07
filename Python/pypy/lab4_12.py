"""
문제: 사용자로부터 5개의 숫자를 입력받아, 이를 리스트에 저장한 후 합과 평균을 구하여 출력한다.
작성자: 김희수
작성일: 170927
"""

list1 = []

for i in range(0, 5):
    num = float(input("숫자를 입력해주세요:"))
    list1.append(num)

avg = sum(list1)/5

print("합: {}\n평균: {}".format(sum(list1), avg))
