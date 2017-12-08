import os

f = open("fruits.txt", "r+")

while(1):
        print(f.tell())
        s = f.readline()

        if(s==""):
            break
        else:
            print(s)