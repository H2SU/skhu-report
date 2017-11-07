"""
주제: 좌표 클래스 정의
작성일: 17. 10. 30.
작성자: 김희수
"""


class coordinate:
    def __init__(self, x, y):
        """
        좌표를 초기화
        :param x: x 좌표의 값
        :param y: y 좌표의 값
        """
        self.x = x
        self.y = y

    def print(self):
        print("좌표 <{},{}>".format(self.x, self.y))

    def distance(self, other):
        dis = ((other.x-self.x)**2 + (other.y-self.y)**2)**0.5
        print("두 점 사이의 거리: ", dis)


c1 = coordinate(2, 3)
c2 = coordinate(3, 1)

c1.print()
c2.print()

c1.distance(c2)
