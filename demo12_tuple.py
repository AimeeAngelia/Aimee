from __ import __

position = (1, 2)
geeks = ('Sheldon', 'Leonard', 'Rajesh', 'Howard')
print(position[0])
for i in geeks:
    print(i)
print(geeks[1:3])
__()
print('%s is %d years old.' % ('Mike', 23))
__()


def get_pos(n):
    return n / 2, n * 2, n ** 2


x, y, z = get_pos(50)
print(x)
print(y)
print(z)
__()
