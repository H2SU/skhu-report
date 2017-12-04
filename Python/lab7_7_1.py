import os

f = open("fruits.txt", "a")

for i in range(0,3):
    fruit = str(input("과일 입력: "))
    f.write(fruit + "\n")

f.close()