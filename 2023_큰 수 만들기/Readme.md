```
def solution(number, k):
    answer = ''
    ind = number.index(maxstr(number[:k+1]))
    while ind < k:
        answer += max(number[ind:k+1])
        ind= number[ind:].index(max(number[ind:k+1])) + ind + 1
        k += 1
        if k==len(number):
            break
    
    return answer + number[k:]
```

실패
