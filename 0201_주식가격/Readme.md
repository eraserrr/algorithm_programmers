```
def solution(prices):
    answer = []
    
    for x in range(len(prices)-1):
        period = len(prices)-x-1
        for y in range(x+1,len(prices)):
            if prices[y] < prices[x]:
                period  = y-x
                break
        
        answer.append(period)
    
    return answer+[0]
    
```
테스트 1 〉	통과 (109.60ms, 18.7MB)<br>
테스트 2 〉	통과 (84.84ms, 17.4MB)<br>
테스트 3 〉	통과 (135.23ms, 19.9MB)<br>
테스트 4 〉	통과 (98.46ms, 18.1MB)<br>
테스트 5 〉	통과 (67.20ms, 17.4MB)<br>
