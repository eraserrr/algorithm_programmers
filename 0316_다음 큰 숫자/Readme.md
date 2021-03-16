```
def solution(n):
    answer = 0
    n = '0' + bin(n)[2:]
    print(n)
    digit = -1
    changed = ''
    for i in range(len(n)-1, 0, -1):
        if n[i]=='1' and n[i-1]=='0':
            digit = i
            changed = n[:i-1] + '10'
            break
    changed += '0' * n[digit+1:].count('0') + '1' * n[digit+1:].count('1')
    
    print(changed)
    
    
    return int(changed,2)
```
정확성  테스트<br>
테스트 1 〉	통과 (0.02ms, 10.3MB)<br>
테스트 2 〉	통과 (0.01ms, 10.2MB)<br>
테스트 3 〉	통과 (0.01ms, 10.3MB)<br>
테스트 4 〉	통과 (0.01ms, 10.3MB)<br>
테스트 5 〉	통과 (0.01ms, 10.3MB)<br>
테스트 6 〉	통과 (0.01ms, 10.2MB)<br>
테스트 7 〉	통과 (0.01ms, 10.2MB)<br>
테스트 8 〉	통과 (0.01ms, 10.1MB)<br>
테스트 9 〉	통과 (0.01ms, 10.3MB)<br>
테스트 10 〉	통과 (0.01ms, 10.2MB)<br>
테스트 11 〉	통과 (0.01ms, 10.2MB)<br>
테스트 12 〉	통과 (0.01ms, 10.1MB)<br>
테스트 13 〉	통과 (0.01ms, 10.2MB)<br>
테스트 14 〉	통과 (0.01ms, 10.2MB)<br>
효율성  테스트<br>
테스트 1 〉	통과 (0.01ms, 10.2MB)<br>
테스트 2 〉	통과 (0.01ms, 10.2MB)<br>
테스트 3 〉	통과 (0.01ms, 10.2MB)<br>
테스트 4 〉	통과 (0.01ms, 10.2MB)<br>
테스트 5 〉	통과 (0.01ms, 10.1MB)<br>
테스트 6 〉	통과 (0.01ms, 10.2MB)<br>
