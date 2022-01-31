from __ import __
from functools import reduce

__()
list_one = range(1, 101)


def add(x, y):
    return x + y


print(reduce(add, list_one))
__()
print(reduce(lambda x, y: x * y, range(1, 101)))
