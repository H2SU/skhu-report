import os

print(os.getcwd())
dir = input("디렉토리 경로를 입력해주세요: ")
print(dir)

try:
    os.chdir(dir)
    dir2 = input("생성할 디렉토리 명을 입력해주세요: ")
    dir3 = "{}{}\\test".format(dir,dir2)
    print(dir3)
    os.makedirs(dir3)
    os.removedirs(dir3)

    for l in os.listdir(dir):
        print(l)
except FileNotFoundError as e:
    print("입력한 디렉토리는 존재하지 않습니다.")
