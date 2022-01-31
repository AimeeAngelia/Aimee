from __ import __

__()


def calcSum(*args: int) -> int:
    sum = 0
    print(args)
    for i in args:
        sum += i
    print(sum)
calcSum(1,2,3)
calcSum(123,456)
calcSum()
__()
def printAll(*args) :
    print(args)
    for i in args :
        print(i,end=' ')
    print()

printAll(1,2,3)
printAll(3,2,1)