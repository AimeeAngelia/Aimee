from __ import __
import re

'''text = 'Hi I am Shirley Hilton.I am his wife.'
m = re.findall(r"\b[Hh]i\b", text)
if not m:
    print('not match')
else:
    print(m)
__()
m = re.findall(r'\bH..\b', text)
print(m)
__()
m = re.findall(r'.', text)
print(m)
__()
m = re.findall(r'\S', text)
print(m)
__()
m = re.findall(r'\bH\S.\S\b', text)
print(m)
__()
m = re.findall(r'I.*e', text)
print(m)
__()
m = re.findall(r'I.*?e', text)
print(m)
__()
'''
# homework
text='site sea sue sweet see case sse ssee loses'
m=re.findall(r'\bs\S*?e\b',text)
print(m)