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
