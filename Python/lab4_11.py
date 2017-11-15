"""
문제: 사용자가 입력한 영문자를 아래와 같이 출력
ex)
BINGO
 INGO
  NGO
   GO
    O
작성자: 김희수
작성일: 17.09.27
"""

str1= input("문자열을 입력해주세요: ")

for i in range(0, len(str1)+1):
    str2 = str1[i:]
    print(str2.rjust(len(str1)))