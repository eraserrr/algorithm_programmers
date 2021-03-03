```
from itertools import combinations
def solution(clothes):
    answer = 0
    
    # 일단 분류를 해야할 것 같음
    classify = {}
    
    for clothe in clothes:
        if clothe[1] in classify.keys():
            classify[clothe[1]] += 1
        else:
            classify[clothe[1]] = 1

    a = 1
    for i in classify.keys():
        a *= (classify[i] + 1)
        
    
    answer = a -1
    
    return answer
```
테스트 1 〉	통과 (0.02ms, 10.3MB)<br>
테스트 2 〉	통과 (0.01ms, 10.2MB)<br>
테스트 3 〉	통과 (0.01ms, 10.2MB)<br>
테스트 4 〉	통과 (0.02ms, 10.2MB)<br>
테스트 5 〉	통과 (0.01ms, 10.2MB)<br>
테스트 6 〉	통과 (0.01ms, 10.2MB)<br>
테스트 7 〉	통과 (0.02ms, 10.2MB)<br>
테스트 8 〉	통과 (0.01ms, 10.1MB)<br>
테스트 9 〉	통과 (0.01ms, 10.1MB)<br>
테스트 10 〉	통과 (0.01ms, 10.2MB)<br>
테스트 11 〉	통과 (0.01ms, 10.2MB)<br>
테스트 12 〉	통과 (0.02ms, 10.2MB)<br>
테스트 13 〉	통과 (0.02ms, 10.3MB)<br>
테스트 14 〉	통과 (0.01ms, 10.3MB)<br>
테스트 15 〉	통과 (0.01ms, 10.2MB)<br>
테스트 16 〉	통과 (0.00ms, 10.2MB)<br>
테스트 17 〉	통과 (0.01ms, 10.1MB)<br>
테스트 18 〉	통과 (0.01ms, 10.2MB)<br>
테스트 19 〉	통과 (0.01ms, 10.2MB)<br>
테스트 20 〉	통과 (0.01ms, 10.2MB)<br>
테스트 21 〉	통과 (0.01ms, 10.2MB)<br>
테스트 22 〉	통과 (0.01ms, 10.2MB)<br>
테스트 23 〉	통과 (0.01ms, 10.1MB)<br>
테스트 24 〉	통과 (0.01ms, 10.2MB)<br>
테스트 25 〉	통과 (0.01ms, 10.2MB)<br>
테스트 26 〉	통과 (0.02ms, 10.1MB)<br>
테스트 27 〉	통과 (0.01ms, 10.2MB)<br>
테스트 28 〉	통과 (0.01ms, 10.2MB)<br>
