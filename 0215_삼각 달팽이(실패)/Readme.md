성공코드의 맨 마지막 줄인 
[y for x in answer for y in x]
는

sum(answer, []) 로도 표현이 


```
def solution(n):
    tri = [[-1]*n for j in range(n)]
    print(tri)
    num = 1
    top = -1
    bot = n+1
    s = -1
    e = n+1
    print('------------------')
    while top < bot:
        # 1단계
        top += 2
        bot -= 1
        s += 1
        e -= 1

        for i in range(top, bot):
            # i 는 현재 층
            tri[i-1][s] = num
            num += 1

        for i in range(s, e+1):
            tri[bot-1][i] = num
            num += 1

        for i in range(bot-1, top, -1):
            tri[i-1][i-1] = num
            num += 1

        print('==========')
        for i in range(n):
            print(tri[i])
        print('==========')
    s = []
    for i in range(n):
        idx = 0
        while(idx < n and tri[i][idx]!= -1):
            s.append(tri[i][idx])
            idx +=1
    return s
```
실패

4.30


```
def solution(n):

    answer = [[0] * (i+1) for i in range(n)]
    s = 0
    e = -1
    num = 1
    idx = 0

    while(True):
        if idx>=n or answer[idx][s]:
            break
        while idx<n and not answer[idx][s]:
        
            answer[idx][s] = num
            num += 1
            idx += 1

        idx -= 1

        for i in range(s+1, len(answer[idx])+e):
            answer[idx][i] = num
            num += 1

        s += 1

        while not answer[idx][e]:
            answer[idx][e] = num
            num += 1
            idx -= 1

        e -= 1
        idx += 2


    return [y for x in answer for y in x]
```


테스트 1 〉	통과 (0.01ms, 10.3MB)<br>
테스트 2 〉	통과 (0.01ms, 10.3MB)<br>
테스트 3 〉	통과 (0.01ms, 10.3MB)<br>
테스트 4 〉	통과 (1.13ms, 10.8MB)<br>
테스트 5 〉	통과 (1.20ms, 10.9MB)<br>
테스트 6 〉	통과 (1.28ms, 10.9MB)<br>
테스트 7 〉	통과 (88.92ms, 58.3MB)<br>
테스트 8 〉	통과 (87.13ms, 59.9MB)<br>
테스트 9 〉	통과 (87.62ms, 60.2MB)<br>
