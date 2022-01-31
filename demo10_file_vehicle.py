class Vehicle:
    def __init__(self,speed):
        self.speed=speed

    def drive(self,distance):
        print('need %.2f hour(s)' % (distance/self.speed))
class Bike(Vehicle):
    pass
class Car(Vehicle):
    def __init__(self,speed,fule):
        Vehicle.__init__(self,speed)
        self.fule=fule
    def drive(self,distance):
        Vehicle.drive(self,distance)
        print('need %.2f fule(s)' % (distance*self.fule))
b=Bike(15.0)
c=Car(80.0,0.012)
b.drive(100.0)
c.drive(100.0)