"""
주제:
1. person 클래스를 정의한다. 이름과 나이를 data attribute로 가지고 있다.
2. 이름과 나이를 매개변수로 받는 생성자가 있다.
3. 나이를 1살 더하는 gerOlder 메소드가 있다.
4. 문자열 반환, 프린트 메소드
작성일: 17.11.08
작성자: 김희수
"""

class person:
    def __init__(self,n,a):
        self.name = n
        self.age = a

    def getOlder(self):
        self.age += 1

    def __str__(self):
        return print("이름: {}\n나이: {}")