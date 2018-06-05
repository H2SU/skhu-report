alpha = ['a', 'b', 'c']

try:
    print(alpha[3])
except IndexError:
    print("인덱스오류입니다.")

try:
    print(4/0)
except ZeroDivisionError:
    print("0으로 나눴습니다.")
