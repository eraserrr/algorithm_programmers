```
from itertools import combinations
def solution(orders, course):
    answer = []

    for c in course:
        ordered = {}
        max_order = 0
        for order in orders:
            tmp = [x for x in combinations(sorted(list(order)),c)]

            for k in tmp:
                if k in ordered:
                    ordered[k] += 1
                else :
                    ordered[k] = 1
                if ordered[k]>max_order:
                    max_order = ordered[k]

        for i in ordered.keys():
            if ordered[i]==max_order and max_order!=1:
                answer.append(''.join(i))
    answer.sort()
    return answer
```
테스트 1 〉	통과 (0.10ms, 10.3MB)<br>
테스트 2 〉	통과 (0.07ms, 10.2MB)<br>
테스트 3 〉	통과 (0.11ms, 10.2MB)<br>
테스트 4 〉	통과 (0.11ms, 10.2MB)<br>
테스트 5 〉	통과 (0.13ms, 10.3MB)<br>
테스트 6 〉	통과 (0.22ms, 10.1MB)<br>
테스트 7 〉	통과 (0.37ms, 10.4MB)<br>
테스트 8 〉	통과 (2.85ms, 10.4MB)<br>
테스트 9 〉	통과 (1.92ms, 10.4MB)<br>
테스트 10 〉	통과 (2.03ms, 10.6MB)<br>
테스트 11 〉	통과 (1.21ms, 10.3MB)<br>
테스트 12 〉	통과 (1.38ms, 10.3MB)<br>
테스트 13 〉	통과 (1.82ms, 10.6MB)<br>
테스트 14 〉	통과 (1.54ms, 10.5MB)<br>
테스트 15 〉	통과 (1.95ms, 10.5MB)<br>
테스트 16 〉	통과 (0.60ms, 10.3MB)<br>
테스트 17 〉	통과 (0.34ms, 10.2MB)<br>
테스트 18 〉	통과 (0.15ms, 10.2MB)<br>
테스트 19 〉	통과 (0.04ms, 10.1MB)<br>
테스트 20 〉	통과 (0.46ms, 10.3MB)<br>
