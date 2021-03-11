```
def solution(s):
    answer = True
    
    stack = []
    
    for bracket in s:
        if bracket=='(':
            stack.append(1)
        if bracket==')':
            if len(stack)==0:
                return False
            stack.pop()
    if len(stack)!=0:
        return False
    return True
    
    return True
```
정확성  테스트<br>
테스트 1 〉	통과 (0.00ms, 10.2MB)<br>
테스트 2 〉	통과 (0.00ms, 10.2MB)<br>
테스트 3 〉	통과 (0.00ms, 10.2MB)<br>
테스트 4 〉	통과 (0.00ms, 10.2MB)<br>
테스트 5 〉	통과 (0.01ms, 10.2MB)<br>
테스트 6 〉	통과 (0.00ms, 10.2MB)<br>
테스트 7 〉	통과 (0.01ms, 10.3MB)<br>
테스트 8 〉	통과 (0.01ms, 10.2MB)<br>
테스트 9 〉	통과 (0.01ms, 10.2MB)<br>
테스트 10 〉	통과 (0.01ms, 10.2MB)<br>
테스트 11 〉	통과 (0.01ms, 10.1MB)<br>
테스트 12 〉	통과 (0.02ms, 10.2MB)<br>
테스트 13 〉	통과 (0.02ms, 10.2MB)<br>
테스트 14 〉	통과 (0.01ms, 10.2MB)<br>
테스트 15 〉	통과 (0.02ms, 10.2MB)<br>
테스트 16 〉	통과 (0.02ms, 10.3MB)<br>
테스트 17 〉	통과 (0.02ms, 10.2MB)<br>
테스트 18 〉	통과 (0.02ms, 10.3MB)<br>
효율성  테스트<br>
테스트 1 〉	통과 (11.65ms, 10.6MB)<br>
테스트 2 〉	통과 (10.97ms, 10.5MB)<br>
