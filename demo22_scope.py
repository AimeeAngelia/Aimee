from __ import __

__()
def func (x):
    print('X in the beginning of func(x): ',x)
    x = 2
    print('X in the end of func(x): ',x)
x= 50
func(x)
print('X after calling func(x): ',x)
__()
def fun ():
    global y
    print('X in the beginning of fun(x): ',y)
    y = 2
    print('X in the end of fun(x): ',y)
y= 50
fun()
print('X after calling fun(x): ',y)
__()