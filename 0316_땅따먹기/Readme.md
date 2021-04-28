```
def solution(land):
    idx = -1
    answer = 0
    
    for i in range(len(land)):
        if idx != land[i].index(max(land[i])):
            idx = land[i].index(max(land[i]))
            answer += max(land[i])
        else:
            tmp = land[i]
            tmp.remove(max(land[i]))
            idx = land[i].index(max(tmp))
            answer += land[i][idx]
    return answer
```

실패

각각의 행들이 유기적으로 영향을 줄 것 같아보이지만


경로를 물어보는 것이 아니라 "값"만을 구하려고 하는 것이다


따라서 현재 위치에서 가질 수 있는 최댓값만을 가지고 있으면 된다

같은 위치를 밟을 수 없으므로 자기 인덱스를 제외하고 나머지에서 최댓값을 찾아준다.


4.28
```
def solution(land):
    answer = 0
    
    for i in range(1,len(land)):
        for j in range(4):
            tmp = [x for x in land[i-1]]
            tmp.pop(j)
            # print(tmp)
            land[i][j] += max(tmp)

    return max(land[-1])
