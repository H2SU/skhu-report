"""
주제:
작성일: 17.11.27
작성자: 김희수
"""

import urllib.request

req = urllib.request
d = req.urlopen("http://sw.skhu.ac.kr")
status = d.getheaders()

for s in status:
    print(s)