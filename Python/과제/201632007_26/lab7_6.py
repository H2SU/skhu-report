"""
문제: lab7_6
작성자: 김희수
작성일: 17.12.01
"""

import shutil
import os

dir = "c:\\Temp\\201632007\\room1"

print(dir)
while(1):
    start = int(input("디렉토리 삭제를 실행합니다.\n실행=1 확인=2 종료=3\n입력: "))

    if (start == 1):
        try:
            shutil.rmtree(dir)
            print("=====================\n"+ dir + "경로에 있는 폴더 및 하위 폴더까지 삭제되었습니다.\n=====================")
        except:
            print("=====================\n해당 디렉토리가 존재하지 않습니다.\n=====================")


    elif(start ==2):
        if(os.path.isdir(dir)):
            print("=====================\n해당 디렉토리는 존재합니다.\n=====================")
        elif(os.path.isdir(dir)==False):
            print("=====================\n해당 디렉토리는 존재하지 않습니다.\n=====================")

    elif (start == 3):
        break

    else:
        print("=====================\n'1','2' 또는 '3'를 눌러주세요.\n=====================")
        continue