from __ import __
import re
__()
'''
list_one = [1, 2, 3, 5, 8, 13, 22]
list_two = []
for i in list_one:
    if i % 2 == 0:
        list_two.append(i)
print(list_two)
__()
list_one = [1, 2, 3, 5, 8, 13, 22]
list_two = [i for i in list_one if i % 2 == 0]
print(list_two)
'''
# homework
end=[]
end=[str(i) for i in range(1,101) if ((i % 2==0) and (i % 3 ==0) and (i % 5 == 0))]
show=';'.join(end)
print(show)
