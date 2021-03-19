```
def solution(n):
    answer = 0
    
    for i in range(int(n/2)+1, 0, -1):
        idx = i
        partial_sum = i
        for j in range(i-1, 0, -1):
            partial_sum += j
            if partial_sum==n:
                answer += 1
                break
            if partial_sum < n:
                continue
            break
    
    return answer+1
```
정확성  테스트<br>
테스트 1 〉	통과 (0.01ms, 10.2MB)<br>
테스트 2 〉	통과 (0.32ms, 10.1MB)<br>
테스트 3 〉	통과 (0.23ms, 10.1MB)<br>
테스트 4 〉	통과 (0.25ms, 10.2MB)<br>
테스트 5 〉	통과 (0.07ms, 10.2MB)<br>
테스트 6 〉	통과 (0.02ms, 10.2MB)<br>
테스트 7 〉	통과 (0.20ms, 10.1MB)<br>
테스트 8 〉	통과 (0.12ms, 10.2MB)<br>
테스트 9 〉	통과 (0.02ms, 10.2MB)<br>
테스트 10 〉	통과 (0.44ms, 10.3MB)<br>
테스트 11 〉	통과 (0.45ms, 10.1MB)<br>
테스트 12 〉	통과 (0.26ms, 10.2MB)<br>
테스트 13 〉	통과 (0.32ms, 10.2MB)<br>
테스트 14 〉	통과 (0.21ms, 10.1MB)<br>
효율성  테스트<br>
테스트 1 〉	통과 (4.82ms, 10.1MB)<br>
테스트 2 〉	통과 (3.11ms, 10.3MB)<br>
테스트 3 〉	통과 (3.66ms, 10.2MB)<br>
테스트 4 〉	통과 (3.61ms, 10.2MB)<br>
테스트 5 〉	통과 (3.90ms, 10.2MB)<br>
테스트 6 〉	통과 (5.65ms, 10.2MB)<br>
