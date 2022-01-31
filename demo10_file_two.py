'''
# 面向过程
speed1:float
speed2: float
speed1, speed2 = 60.0, 150.0
distance1:float = 100.0
distance2: float = 200.0
distance:float=distance1+distance2
time1:float=distance/speed1
time2:float=distance/speed2
print(time1)
print(time2)
print(distance)
'''
# 面向过程
class Car:
    speed=0
    def drive(self,distance):
        time_everyone=distance/self.speed
        print(time_everyone)
one=Car()
one.speed=60.0
one.drive(300.0)
two=Car()
two.speed=150.0
two.drive(300.0)