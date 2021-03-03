```
def solution(n):
    answer = ''
    
    a = []
    x = n
    
    while(x > 1):
        a.append(x % 3)
        x = x//3
    if x==1:
        a.append(1)
    b = [str(x) for x in a]
    for i in range(len(a[:-1:])):
        if a[i]==1 and a[i+1]==0:
            b[i] = '4'
            b.pop(chr(i+1))
    
    
    return ''.join(b)
```

