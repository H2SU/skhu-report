class car():
    name = ''
    cc = 0

    def __init__(self, name, cc):
        self.name = name
        self.cc = cc

    def eat(self):
        print("먹는중")

    def setNameCC(self,name,cc):
        self.name = name


    def setCC(self,cc):

class suv(car):
    def eat(self):
        super().name =


ferrari = car()
ferrari.setName()
ferrari.setCC()

k3 = car("k3", 1800)

print(ferrari.name)

ferrari.setName('audi')


print(ferrari.name)
