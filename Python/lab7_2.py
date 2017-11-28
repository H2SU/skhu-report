import os

print(os.getcwd())
dir = input("디렉토리 경로를 입력해주세요: ")

try:
    os.chdir(dir)
    for l in os.listdir(dir):
        print(l)
except FileNotFoundError as e:
    print("입력한 디렉토리는 존재하지 않습니다.")

