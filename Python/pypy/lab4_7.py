"""
주제: for 반복문
작성일: 2017.09.25
작성자: 홍은지
"""

l = [1, 3, 5];

for i in (1, 6, 2):
    print(i)

s = "성공회대학교"
for c in s:
    print(c)

# 1에서 100까지 합을 구하시오.
sum = 0
for i in range(1, 101):
    sum += i
print(sum)

# 1에서 100까지 3의 배수의 합을 구하여 출력하시오.
sum = 0
for i in range(99, 0, -3):
    sum += i
print(sum)

# 1에서 100까지의 합을 while 을 이용하여 구하여 출력하시오.
sum = 0
i = 1

while( i <= 100 ):
    sum += i
    i += 1
print(sum)

