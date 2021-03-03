```
def solution(s):
    len_min = len(s)
    for unit in range(1, int(len(s)/2)+1):
        compressed = len(s)
        for i in range(len(s)-unit):
            # 탐색을 할 부분문자열의 위치
            idx = i+unit
            num = 0
            while(s[idx:].find(s[i:i+unit])==0):
                idx += unit
                num += 1

            if num >0:
                compressed = compressed - num * unit + 1
            i += unit*(num+1)
        if compressed < len_min:
            len_min = compressed
    return len_min
```
