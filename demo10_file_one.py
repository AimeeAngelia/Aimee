'''
# 面向过程
speed = 60.0
distance = 100.0
time = distance / speed
print('%.2f' %time)
'''
'''面向对象'''
class Car:
    speed=0
    def drive (self,distance):
        time=distance/self.speed
        print('%.2f'%time)

car=Car()
car.speed=60.0
car.drive(100.0)