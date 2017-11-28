def divide(x,y):
    """
    예외처리
    :param x: 정수값
    :param y: 정수값
    :return: 나눗셈 결과값 반환
    """
    try: # 아래 코드 실행 시 에러가 나면 except문으로 넘어감
        return x// y # x를 y로 나눔
    except ZeroDivisionError: # x를 0으로 나눌 시 발생하는 에러가 뜬 다면 아래 코드 실행
        return "0으로 나눌 수 없습니다." # 앞의 문자열을 리턴해줌


a = int(input("첫 번째 정수 입력: "))
b = int(input("두 번째 정수 입력: "))

print("a÷b= {}".format(divide(a,b)))