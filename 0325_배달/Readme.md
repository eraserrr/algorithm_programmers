```
def solution(N, road, K):
    answer = 0
    
    # 스타트는 1 에서
    q = [1]
    visited = []
    shortest = [0] + [2001] * (N-1)
    # print(shortest)
    length = {}
    for i in range(len(road)):
        if (road[i][0], road[i][1]) in length.keys():
            min(length[(road[i][0], road[i][1])], (road[i][2]))
        elif (road[i][1], road[i][0]) in length.keys():
            min(length[(road[i][1], road[i][0])], (road[i][2]))
        else:
            length[(road[i][0], road[i][1])] = road[i][2]
    # print(length)

    for i in range(1,N+1):
        if (1, i) in length.keys():
            q.append(i)
    pre = 0
    cur = 0
    # print('시작 ', q)
    while (True):
        cur = q.pop(0)
        visited.append(cur)
        near = []
        # print(cur, '에서 탐색 시작 ')
        for i in range(1,len(length)+1):
            # print(cur, i)
            if (cur, i) in length.keys() or (i, cur) in length.keys():
                near.append(i)
                # print(cur, '에서 근접한 도시', near)
        # print(cur,'에서 근접한 도시 ', near)
        for i in range(len(near)):
            key = -1
            if (cur,near[i]) in length.keys():
                key = (cur,near[i])
            if (near[i], cur) in length.keys():
                key = (near[i], cur)
            # print(key)
            cur_d = shortest[cur-1]+length[key]
            # print('cur_d', cur_d)
            shortest[near[i]-1] = min(shortest[near[i]-1], cur_d)
            
        print(shortest)

        q = [x for x in near if x not in q and x not in visited] + q
        # print('주변 탐색 완료', q)
        if q == []:
            break
    for s in shortest:
        if s <= K:
            answer += 1
    return answer
```


4.28

```
def solution(N, road, K):
    answer = 0

    # 각 마을마다 비용
    cost = [20000000] * (N+1)
    cost[1] = 0
    a = [[0]*(N+1) for _ in range(N+1)]

    for r in road:
        if a[r[0]][r[1]]:
            a[r[0]][r[1]] = min(a[r[0]][r[1]],r[2])
            a[r[1]][r[0]] = a[r[0]][r[1]]
            continue
        a[r[1]][r[0]] = r[2]
        a[r[0]][r[1]] = r[2]

    st = []
    for i in range(len(a[1])):
        if a[1][i]:
            st.append(i)
    visited = [1]

    while(st):
        s = st.pop()

        for i in range(len(a[s])):
            # 연결됨
            if a[s][i]:
                # 방문했던 경로와 연결되있으므로 최솟값비교
                if i in visited:
                    cost[s]= min(cost[i]+a[s][i], cost[s])
                if cost[s] + a[s][i] < cost[i]:
                    cost[i] = cost[s] + a[s][i]
                    st.append(i)
        visited.append(s)

    return len([x for x in cost if x<=K])

```
테스트 1 〉	통과 (0.06ms, 10.4MB)<br>
테스트 2 〉	통과 (0.04ms, 10.3MB)<br>
테스트 3 〉	통과 (0.04ms, 10.3MB)<br>
테스트 4 〉	통과 (0.03ms, 10.4MB)<br>
테스트 5 〉	통과 (0.06ms, 10.3MB)<br>
테스트 6 〉	통과 (0.03ms, 10.3MB)<br>
테스트 7 〉	통과 (0.05ms, 10.3MB)<br>
테스트 8 〉	통과 (0.04ms, 10.3MB)<br>
테스트 9 〉	통과 (0.02ms, 10.3MB)<br>
테스트 10 〉	통과 (0.06ms, 10.3MB)<br>
테스트 11 〉	통과 (0.07ms, 10.4MB)<br>
테스트 12 〉	통과 (0.23ms, 10.3MB)<br>
테스트 13 〉	통과 (0.17ms, 10.3MB)<br>
테스트 14 〉	통과 (5.07ms, 10.3MB)<br>
테스트 15 〉	통과 (7.27ms, 10.2MB)<br>
테스트 16 〉	통과 (0.12ms, 10.4MB)<br>
테스트 17 〉	통과 (0.15ms, 10.3MB)<br>
테스트 18 〉	통과 (3.42ms, 10.3MB)<br>
테스트 19 〉	통과 (9.00ms, 10.4MB)<br>
테스트 20 〉	통과 (1.77ms, 10.3MB)<br>
테스트 21 〉	통과 (8.19ms, 10.4MB)<br>
테스트 22 〉	통과 (3.88ms, 10.3MB)<br>
테스트 23 〉	통과 (9.12ms, 10.4MB)<br>
테스트 24 〉	통과 (6.98ms, 10.5MB)<br>
테스트 25 〉	통과 (12.84ms, 10.6MB)<br>
테스트 26 〉	통과 (12.17ms, 10.6MB)<br>
테스트 27 〉	통과 (15.80ms, 10.5MB)<br>
테스트 28 〉	통과 (11.94ms, 10.5MB)<br>
테스트 29 〉	통과 (15.18ms, 10.5MB)<br>
테스트 30 〉	통과 (4.62ms, 10.5MB)<br>
테스트 31 〉	통과 (0.64ms, 10.3MB)<br>
테스트 32 〉	통과 (0.95ms, 10.4MB)<br>
