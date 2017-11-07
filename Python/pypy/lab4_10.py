"""
주제: 밑변이 5개의 *로 구성된 직각삼각형 출력
작성일: 17.09.27
작성자: 김희수
"""

s = "*"

for i in range(1, 6):
    print(s*i)

for j in range(1,6):
    print(s*(6-j))