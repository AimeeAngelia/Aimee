class MyClass:
    name='Sam'

    def sayhi(self):
        print('Hello %s' % self.name)

mc=MyClass()
print(mc.name)
mc.name='Lily'
mc.sayhi()
print(mc)