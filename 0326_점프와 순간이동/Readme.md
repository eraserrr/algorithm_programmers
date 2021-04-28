4.28 

이거왜 못 풀었지....?

```
def rec(n):
    if n==1:
        return 1
    if n==2:
        return 1

    if n%2==0:
        return rec(n//2)
    else:
        return rec(n-1) + 1
    return -1

def solution(n):
    answer = rec(n)

    return answer


```
