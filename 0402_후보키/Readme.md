파이썬에서 <br>
[0,2,1] != [0,1,2] <br>
[0,1,2] == [0,1,2] <br>

이고, <br>
{0,1,2} == {0,2,1} <br>
이다.<br>

부분집합을 구할때에는 set 자료형의 intersection을 이용할 수 있다. <br>


```
from itertools import combinations

def solution(relation):
    answer = 0
    candidate_key = []
    for num in range(1, len(relation)):
        # relation의 속성 조합
        for comb in list(combinations(range(len(relation[0])),num)):
            came_out = []
            is_candidate = True
            # comb에서의 유일성 확인
            for i in range(len(relation)):
                x = []
                for j in comb:
                    x.append(relation[i][j])
                # 증복된게 있는 거임. 즉 이 comb 조합은 중복키가 아니다.
                if x in came_out:
                    is_candidate = False
                    break
                came_out.append(x)

            # 이 조합이 유일성을 만족
            if is_candidate:
                # 최소성을 만족하는 지 확인해야함
                for i in candidate_key:
                    # candidate 의 원소 중 하나와 comb 의 교집합이 그 원소라면
                    if set(i).intersection(set(comb))==set(i):
                        is_candidate = False
                        break
                if is_candidate:
                    candidate_key.append(comb)

    return len(candidate_key)
```
테스트 1 〉	통과 (0.04ms, 10.2MB)<br>
테스트 2 〉	통과 (0.03ms, 10.3MB)<br>
테스트 3 〉	통과 (0.03ms, 10.2MB)<br>
테스트 4 〉	통과 (0.05ms, 10.1MB)<br>
테스트 5 〉	통과 (0.04ms, 10.3MB)<br>
테스트 6 〉	통과 (0.02ms, 10.3MB)<br>
테스트 7 〉	통과 (0.01ms, 10.2MB)<br>
테스트 8 〉	통과 (0.02ms, 10.3MB)<br>
테스트 9 〉	통과 (0.14ms, 10.2MB)<br>
테스트 10 〉	통과 (0.16ms, 10.2MB)<br>
테스트 11 〉	통과 (0.27ms, 10.3MB)<br>
테스트 12 〉	통과 (1.23ms, 10.3MB)<br>
테스트 13 〉	통과 (0.50ms, 10.2MB)<br>
테스트 14 〉	통과 (0.05ms, 10.2MB)<br>
테스트 15 〉	통과 (0.04ms, 10.1MB)<br>
테스트 16 〉	통과 (0.07ms, 10.2MB)<br>
테스트 17 〉	통과 (0.07ms, 10.3MB)<br>
테스트 18 〉	통과 (4.54ms, 10.2MB)<br>
테스트 19 〉	통과 (1.59ms, 10.1MB)<br>
테스트 20 〉	통과 (4.21ms, 10.3MB)<br>
테스트 21 〉	통과 (1.21ms, 10.2MB)<br>
테스트 22 〉	통과 (1.15ms, 10.3MB)<br>
테스트 23 〉	통과 (0.08ms, 10.4MB)<br>
테스트 24 〉	통과 (1.49ms, 10.3MB)<br>
테스트 25 〉	통과 (3.99ms, 10.2MB)<br>
테스트 26 〉	통과 (2.30ms, 10.2MB)<br>
테스트 27 〉	통과 (0.49ms, 10.3MB)<br>
테스트 28 〉	통과 (0.43ms, 10.2MB)<br>
