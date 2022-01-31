import requests
req=requests.get('http://www.baidu.com')
print(req)
req.encoding='utf8'
content=req.text
print(content)
f=open('baidu.html','w')
f.write(content)
f.close()