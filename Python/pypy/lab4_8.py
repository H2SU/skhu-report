"""
주제: for 반복문
작성일: 2017.09.25
작성자: 김희수
"""

# 1부터 사용자가 입력한 수까지의 모든 약수를 리스트 형태로 출력
num = int(input("자연수를 입력해주세요: "))

for i in range(1, num + 1):  # 1부터 사용자가 입력한 수까지 i에 대입
    list = []  # 빈 리스트 list 생성
    for j in range(1, i + 1):  # 1부터 i 까지의 수를 j에 대입
        if (i % j == 0):  # i를 j로 나눴을 때 나머지가 0이 된다면 j는 i의 약수이다.
            list.append(j)  # i의 약수인 j를 list 에 append 를 사용하여 저장
    print(list)  # i의 약수가 저장된 list 를 출력
