"""
주제 : 분수와 특수연산자
작성자 : 김희수
작성일 : 17.11.05
"""

class fraction:
    def __init__(self,numer,denom):
        """
        생성자
        :param numer: 분모
        :param denom: 분자
        """
        self.numer = numer
        self.denom = denom

    def print(self):
        """
        출력 메소드
        :return: 출력
        """
        return "출력 : {}/{}".format(self.denom,self.numer)

    def __str__(self):
        """
        :return: 문자열 출력
        """
        return "출력 : {}/{}".format(str(self.denom),str(self.numer))

    def __add__(self,other):
        """
        분수의 합을 구하는 메소드
        :param other: 분수2
        :return: 합 결과
        """
        d = self.numer * other.denom + self.denom * other.numer
        n = self.numer * other.numer
        if(d == 0):
            return 0

        return print(n,d)

    def __sub__(self, other):
        """
        분수의 차를 구하는 메소드
        :param other: 분수2
        :return: 뺄셈 결과
        """
        d = self.denom * other.numer - self.numer * other.denom
        n = self.numer * other.numer
        if (d == 0):
            return 0

        return print(n,d)

    def  __eq__(self, other):
        """
        equal 메소드
        :param other: 분수2
        :return: True or False
        """
        if(self.denom * other.numer == self.numer * other.denom):
            return True
        else:
            return False

    def __ne__(self, other):
        """
        not equal 메소드
        :param other: 분수2
        :return: True or False
        """
        if (self.denom * other.numer != self.numer * other.denom):
            return True
        else:
            return False

    def __lt__(self, other):
        """
        두 분수 크기비교 메소드
        :param other: 분수2
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



f1 = fraction(4,2)
f2 = fraction(7,4)
print("f1: ",f1)
print("f2: ",f2)
print("f1+f2: ",f1+f2)
print("f1-f2: ",f1 - f2)
print("f1==f2: ",f1 == f2)
print("f1<f2: ",f1 < f2)
print("f1>f2: ",f1 > f2)
print("f1!=f2: ",f1 != f2)
