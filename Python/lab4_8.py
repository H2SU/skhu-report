a = int(input("수를 입력하세요 : "))
for i in range(1, a+1):
    l = []
    for n in range(1,i+1):
        if(i%n == 0):
            l.append(n)
    print("%s의 약수 : "%i,l)