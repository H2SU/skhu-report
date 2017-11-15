"""
주제:
1.이름 학번 학과를 매개변수로 받아서 이를 출력하는 함수 print_me 함수를 정의한다.
이 때, 학과가 매개변수로 넘어오지 않으면, "소프트웨어공학과"를 디폴드 값으로 한다.
2. 자신의 이름 학번 학과를 매개변수로 print_me를 ㅎ출한다.
3. 자신의 이름, 학번을 매개변수로 print_me를 호출한다.

작성자: 김희수
작성일: 17.10.16.=
"""


def print_me(name, grade, major="소프트웨어공학과"):
    """
    매개변수를 받아 출력한다.
    :param name: 이름
    :param grade: 학번
    :param major: 학과
    :return: 없음
    """

    print("이름: ", name)
    print("학번: ", grade)
    print("학과: ", major)


print_me("김희수", "201632007", "컴퓨터공학과")
print_me("김일수", "201632001")
