from __ import __
import random
__()
a=0
for i in range(5):
    b=random.choice(range(5))
    a+= i / b
print(a)
# ZeroDivisionError: division by zero
