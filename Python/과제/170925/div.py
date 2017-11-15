num = int(input("정수를 입력해주세요: "))

if(num%3==0 and num%4!=0):
    print("{}은 3의 배수입니다.".format(num))
elif(num%3!=0 and num%4==0):
    print("{}은 4의 배수입니다.".format(num))
elif(num%3==0 and num%4==0):
    print("{}은 3과4의 공배수입니다.".format(num))
else:
    print("3의 배수도, 4의 배수도 아닙니다")