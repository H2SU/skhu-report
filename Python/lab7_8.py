import os

f = open("fruits.txt", 'r')

fruits = f.readlines()

for fruit in fruits:
    print(fruit,end="")