"""lab5_11
주제 : 분수
작성일 : 17. 11. 05.
작성자 : 201632023 이지훈
"""

class fraction:
    def __init__(self,numer,denom):
        """
        분수 초기화
        :param numer: 분모
        :param denom: 분자
        """
        self.numer = numer
        self.denom = denom

    def prnt(self):
        """
        출력하는 메소드
        :return: 없음
        """
        return "출력 : " + str(self.denom) + "/" + str(self.numer)

    def __str__(self):
        """
        :return: 문자열
        """
        return "출력 : "+str(self.denom)+"/"+str(self.numer)

    def __add__(self,other):
        """
        두 분수를 더해주는 메소드
        :param other: 더할 분수
        :return: 두 분자의 합의 결과
        """
        add = self.numer * other.denom + self.denom * other.numer
        c = self.numer * other.numer
        if(add == 0):
            return fraction(0,0)

        for i in range(2,c):
            if(add%i == 0 and c%i == 0):
                add = add//i
                c = c//i
                i = 2

        s = fraction(c,add)
        return s

    def __sub__(self, other):
        """
        두 분수를 더해주는 메소드
        :param other: 더할 분수
        :return: 두 분자의 합의 결과
        """
        sub = self.denom * other.numer - self.numer * other.denom
        c = self.numer * other.numer
        if (sub == 0):
            return fraction(0,0)
        for i in range(2,c):
            if(sub%i == 0 and c%i == 0):
                sub = sub//i
                c = c//i
                i = 2
        s = fraction(c, sub)
        return s

    def  __eq__(self, other):
        """
        두 분수가 같은지 비교해주는 메소드
        :param other: 비교할 메소드
        :return: True or False
        """
        if(self.denom * other.numer == self.numer * other.denom):
            return True
        else:
            return False

    def __ne__(self, other):
        """
        두 분수가 같지 않은지 비교해주는 메소드
        :param other: 비교할 메소드
        :return: True or False
        """
        if (self.denom * other.numer != self.numer * other.denom):
            return True
        else:
            return False

    def __lt__(self, other):
        """
        두 분수중 other가 큰지 비교해 주는 메소드
        :param other: 비교할 메소드
        :return: True or False
        """
        if (self.denom * other.numer < self.numer * other.denom):
            return True
        else:
            return False

    def __gt__(self, other):
        """
        두 분수중 self가 큰지 비교해 주는 메소드
        :param other: 비교할 메소드
        :return: True or False
        """
        if (self.denom * other.numer > self.numer * other.denom):
            return True
        else:
            return False



c1 = fraction(4,2)
c2 = fraction(7,4)
print("1번 분수",c1)
print("2번 분수",c2)
print("덧셈",c1+c2)
print("뺄셈",c1 - c2)
print("두 분수가 같은가? :",c1 == c2)
print("뒤쪽 분수가 더 큰가? :",c1 < c2)
print("앞쪽 분수가 더 큰가? :",c1 > c2)
print("두 분수가 같지 않은가? :",c1 != c2)
