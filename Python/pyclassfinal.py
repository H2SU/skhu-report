class human():
    name = ''
    age = 0
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def eat(self, age):
        self.age = age


ohsangwon = human(22)
ohsangwon.age(22)
