from __ import __

__()
list_one = [1, 2, 3, 4, 5, 6]


def double_func(x):
    return x * 2


list_double = map(double_func, list_one)
print(list(list_double))
print(type(list_double))

__()

list_double_lambda = map(lambda x: x * 2, list_one)
print(list(list_double_lambda))

__()

list_two = (1, 3, 5, 7, 9, 11)
list_sum = map(lambda x, y: x + y, list_one, list_two)
print(list(list_sum))
