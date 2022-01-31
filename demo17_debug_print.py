from __ import __
import random
__()
a=0
for i in range(5):
    print('i : %d' % i)
    b=random.choice(range(5))
    print('b : %d' % b)
    a+=i/b
    print('a : %d' % a)
    print()
print(a)