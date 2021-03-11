```
from itertools import combinations

def solution(info, query):
    kinds = {}
    answer = []

    for i in info:
        tmp = i.split(' ')
        for x in range(1,len(tmp)):
            for comb in list(combinations(tmp[:-1],x)):
                if ''.join(comb) in kinds.keys():
                    kinds[''.join(comb)] += ' '  + tmp[-1]
                else:
                    kinds[''.join(comb)] = tmp[-1]
                    
    for q in query:
        num = 0
        tmp = q.split(' ')[::2]
        grade = q.split(' ')[-1]
        tmp = [x for x in tmp if x!='-']
        if ''.join(tmp) == '':
            for i in info:
                if int(i.split(' ')[-1]) >= int(grade):
                    num += 1

        if ''.join(tmp) in kinds.keys():
            for x in kinds[''.join(tmp)].split(' '):
                if int(x) >= int(grade):
                    num += 1

        answer.append(num)
    
    return answer
```
실패<br>
정확성  테스트<br>
테스트 1 〉	통과 (0.39ms, 10.4MB)<br>
테스트 2 〉	통과 (0.39ms, 10.4MB)<br>
테스트 3 〉	통과 (0.75ms, 10.4MB)<br>
테스트 4 〉	통과 (3.31ms, 10.5MB)<br>
테스트 5 〉	통과 (7.82ms, 10.5MB)<br>
테스트 6 〉	통과 (18.13ms, 10.4MB)<br>
테스트 7 〉	통과 (9.35ms, 10.6MB)<br>
테스트 8 〉	통과 (82.43ms, 10.9MB)<br>
테스트 9 〉	통과 (83.42ms, 11.2MB)<br>
테스트 10 〉	통과 (86.97ms, 11.4MB)<br>
테스트 11 〉	통과 (7.95ms, 10.4MB)<br>
테스트 12 〉	통과 (17.61ms, 10.5MB)<br>
테스트 13 〉	통과 (10.41ms, 10.5MB)<br>
테스트 14 〉	통과 (53.77ms, 10.8MB)<br>
테스트 15 〉	통과 (51.46ms, 10.8MB)<br>
테스트 16 〉	통과 (7.73ms, 10.4MB)<br>
테스트 17 〉	통과 (18.50ms, 10.4MB)<br>
테스트 18 〉	통과 (49.40ms, 10.8MB)<br>
효율성  테스트<br>
테스트 1 〉	실패 (시간 초과)<br>
테스트 2 〉	실패 (시간 초과)<br>
테스트 3 〉	실패 (시간 초과)<br>
테스트 4 〉	실패 (시간 초과)<br>
