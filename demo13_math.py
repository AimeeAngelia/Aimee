from __ import __
import math

pi = math.pi
e = math.e
print(pi)
print(e)
__()


def homework(a: object, b: object, c: object) -> object:
    cut = ((b ** 2) - 4 * a * c)
    end = math.sqrt(cut)
    answer1 = (-b + end) / (2 * a)
    answer2 = (-b - end) / (2 * a)
    print(answer1, end=' ')
    print(answer2)


homework(15,70,33)
