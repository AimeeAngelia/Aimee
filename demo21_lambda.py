from __ import __

__()
number = (1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
a = sum(number)
print(a)
__()
sum_myself = lambda a, b, c: a + b + c
print(sum_myself(1, 2, 3))
print(sum_myself(4, 5, 6))
__()


def fn(x):
    return lambda y: x + y


a_1 = fn(2)
print(a_1(3))
