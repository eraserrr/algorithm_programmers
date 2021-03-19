```
def solution(s):
    answer = [0,0]
        
    while(True):
        if s=='1':
            return answer
        answer[0] += 1
        answer[1] += len(s)-s.count('1')
        # 1의 모든 0을 제거
        s = '1' * s.count('1')
        # s의 길이를 이진수로 표현
        c = bin(len(s))
        s = c[2:]
    
    return answer
```
테스트 1 〉	통과 (0.01ms, 10.2MB)<br>
테스트 2 〉	통과 (0.20ms, 10.3MB)<br>
테스트 3 〉	통과 (0.01ms, 10.1MB)<br>
테스트 4 〉	통과 (0.01ms, 10.2MB)<br>
테스트 5 〉	통과 (0.01ms, 10.2MB)<br>
테스트 6 〉	통과 (0.01ms, 10.1MB)<br>
테스트 7 〉	통과 (0.02ms, 10.1MB)<br>
테스트 8 〉	통과 (0.01ms, 10.2MB)<br>
테스트 9 〉	통과 (0.43ms, 10.3MB)<br>
테스트 10 〉	통과 (1.32ms, 10.2MB)<br>
테스트 11 〉	통과 (0.43ms, 10.3MB)<br>
