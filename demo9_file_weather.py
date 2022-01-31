# -*- coding: 'utf-8' -*-
def __():
    print('*' * 100)


def date_time(date):
    city_foresocast = city_data['forecast'][date]
    # print(city_foresocast)
    __()
    print(city_foresocast['date'])
    print(city_foresocast.get('high'))
    print(city_foresocast.get('low'))
    print(city_foresocast.get('fengxiang'))
    print(city_foresocast.get('type'))
    print('风力', end=' ')
    print(city_foresocast.get('fengli'))
    __()


import requests

while True:
    city = input('请输入城市，回车确认：')
    # city='北京'
    if not city:
        break
    try:
        req = requests.get('http://wthrcdn.etouch.cn/weather_mini?city=%s' % city)
    except:
        print('查询失败')
    # print(type(req.text))
    dic_city = req.json()
    # print(type(dic_city))
    # print(dic_city)
    city_data = dic_city.get('data')
    # print(city_data)
    if city_data:
        __()
        print('今天')
        date_time(0)
        print('明天')
        date_time(1)
        print('后天')
        date_time(2)
        city_ganmao = city_data.get('ganmao')
        print('温馨提醒')
        print(city_ganmao)
    else:
        print('未获得')
