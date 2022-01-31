from __ import __
import time
__()
'''
while True:
    print(time.time())
    time.sleep(1)
'''
start_timme=time.time()
print('start : %f' %start_timme)
for i in range(0,100000):
    pass
end_time=time.time()
print('end : %f' %end_time)
print('total time:%f'%(end_time-start_timme))
