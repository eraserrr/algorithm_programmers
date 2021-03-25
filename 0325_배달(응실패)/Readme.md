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
