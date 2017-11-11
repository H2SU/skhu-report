"""
주제: 구구단 출력
작성자: 김희수
작성일: 17.09.27
"""

for i in range(2, 10):
    print("{}단".format(i))
    for j in range(1, 10):
        print("{}x{}={}".format(i, j, i*j))
