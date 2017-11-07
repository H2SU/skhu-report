"""
주제: type 함수 사용
작성자: 김희수
작성일: 171016
"""

def value_type(a):
    """
    :param a: 매개변수 a
    :return: 값 a, 타입은 <class 'type(a)'>
    """

    return "값: {}, 타입: {}".format(a,type(a))

a = 5
b = "김희수"
c = 3.14
d = True

print("type a: ", type(a))
print("type b: ", type(b))
print("type c: ", type(c))
print("type d: ", type(d))

print(value_type(a))
print(value_type(b))
print(value_type(c))
print(value_type(d))