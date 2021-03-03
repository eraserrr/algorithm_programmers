```
import math


def solution(progresses, speeds):
    answer = []
    times = []

    for i in range(len(progresses)):
        # 각 요소마다 일단 얼마나 걸리는지 계산을 해야함
        time = math.ceil((100 - progresses[i]) / speeds[i])
        times.append(time)

    dist = 0

    for i in range(1,len(times)):
        if times[dist]<times[i]:
            answer.append(i-dist)
            dist = i

        if i==len(times)-1:
            answer.append(i-dist+1)


    return answer
```
테스트 1 〉	통과 (0.01ms, 10.2MB)<br>
테스트 2 〉	통과 (0.06ms, 10.2MB)<br>
테스트 3 〉	통과 (0.05ms, 10.1MB)<br>
테스트 4 〉	통과 (0.02ms, 10.3MB)<br>
테스트 5 〉	통과 (0.01ms, 10.2MB)<br>
테스트 6 〉	통과 (0.01ms, 10.2MB)<br>
테스트 7 〉	통과 (0.04ms, 10.2MB)<br>
테스트 8 〉	통과 (0.01ms, 10.2MB)<br>
테스트 9 〉	통과 (0.04ms, 10.2MB)<br>
테스트 10 〉	통과 (0.04ms, 10.2MB)<br>
테스트 11 〉	통과 (0.01ms, 10.2MB)<br>
