"""

"""

class student:
    tag = 1

    def __init__(self,n,g):
        self.name = n
        self.grade = student.tag
        self.code = g
        student.tag += 1

    def print(self):
        return

    def __str__(self):
        return "학번: {}\n이름: {}\n학년: {}".format(self.code,self.name,self.grade)


s1 = student("김희수", 201632007)
s2 = student("밀베", 123123)

print(s1)
print(s2)
