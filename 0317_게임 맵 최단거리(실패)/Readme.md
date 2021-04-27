```
def solution(maps):
    answer = 0
    
    distance = []
    queue = []

    for i in range(len(maps)):
        distance.append([0]*len(maps[0]))
    maps[len(maps)-1][len(maps)-1] = 0

    if maps[len(maps)-1][len(maps)-2]!=0:
        distance[len(maps)-1][len(maps)-2]=1
        queue.append([len(maps)-2,len(maps)-1])

    if maps[len(maps)-2][len(maps)-1]!=0:
        distance[len(maps)-2][len(maps)-1]=1
        queue.append([len(maps)-1,len(maps)-2])

    x = -1
    y = -1

    while(True):
        if len(queue)==0:
            return -1
        a = queue.pop(0)
        x = a[0]
        y = a[1]
        if x+y==1:
            break
        if x+1 != len(maps) and maps[y][x+1] != 0:
            if distance[y][x+1]==0:
                distance[y][x + 1] = distance[y][x] + 1
                queue.append([x+1,y])
            distance[y][x+1] = min(distance[y][x+1],distance[y][x]+1)
        if x != 0 and maps[y][x-1] != 0:
            if distance[y][x-1] == 0:
                distance[y][x-1] = distance[y][x] + 1
                queue.append([x-1, y])
            distance[y][x-1] = min(distance[y][x-1], distance[y][x] + 1)
        if y+1 != len(maps) and maps[y+1][x] != 0:
            if distance[y+1][x]==0:
                distance[y+1][x] = distance[y][x] + 1
                queue.append([x,y+1])
            distance[y+1][x] = min(distance[y+1][x],distance[y][x]+1)
        if y != 0 and maps[y-1][x] != 0:
            if distance[y-1][x] == 0:
                distance[y-1][x] = distance[y][x] + 1
                queue.append([x, y-1])
            distance[y-1][x] = min(distance[y-1][x], distance[y][x] + 1)

    if distance[0][1]==0:
        return distance[1][0]+2
    if distance[1][0]==0:
        return distance[0][1]+2
    return min(distance[1][0], distance[0][1])+2
```
실패

정확성  테스트<br>
테스트 1 〉	실패 (런타임 에러)<br>
테스트 2 〉	실패 (0.02ms, 10.3MB)<br>
테스트 3 〉	실패 (0.04ms, 10.5MB)<br>
테스트 4 〉	통과 (0.05ms, 10.4MB)<br>
테스트 5 〉	실패 (런타임 에러)<br>
테스트 6 〉	실패 (0.04ms, 10.3MB)<br>
테스트 7 〉	통과 (0.12ms, 10.4MB)<br>
테스트 8 〉	실패 (0.04ms, 10.4MB)<br>
테스트 9 〉	실패 (0.10ms, 10.4MB)<br>
테스트 10 〉	통과 (0.08ms, 10.4MB)<br>
테스트 11 〉	실패 (0.03ms, 10.3MB)<br>
테스트 12 〉	통과 (0.02ms, 10.3MB)<br>
테스트 13 〉	실패 (0.03ms, 10.4MB)<br>
테스트 14 〉	실패 (0.04ms, 10.4MB)<br>
테스트 15 〉	통과 (0.01ms, 10.4MB)<br>
테스트 16 〉	통과 (0.02ms, 10.4MB)<br>
테스트 17 〉	실패 (0.01ms, 10.3MB)<br>
테스트 18 〉	실패 (0.02ms, 10.4MB)<br>
테스트 19 〉	실패 (런타임 에러)<br>
테스트 20 〉	통과 (0.01ms, 10.3MB)<br>
테스트 21 〉	통과 (0.01ms, 10.4MB)<br>
효율성  테스트<br>
테스트 1 〉	통과 (21.80ms, 10.2MB)<br>
테스트 2 〉	실패 (4.75ms, 10.3MB)<br>
테스트 3 〉	통과 (12.30ms, 10.4MB)<br>
테스트 4 〉	통과 (7.95ms, 10.4MB)<br>
테스트 6 〉	실패 (0.04ms, 10.3MB)<br>
테스트 7 〉	통과 (0.12ms, 10.4MB)<br>
테스트 8 〉	실패 (0.04ms, 10.4MB)<br>

<br>

4.27  정확성 100, 효율성에서 0 => 실패
```
def solution(maps):

    record = [[0]*len(maps[0]) for _ in maps]
    record[0][0] = 1
    direction = {'right':[0,1], 'left':[0,-1], 'up':[-1,0], 'down':[1,0]}
    pre_loc = []
    cur_loc = [0,0]
    cross_road = []
    cross_road_pre = []


    while (True):
        # 현재 위치에서 갈 수 있는 방향 탐색 후 저장
        possible = []
        for dir in direction.keys():
            a = [a+b for a,b in zip(cur_loc,direction[dir])]
            # 이 방향이 왔던 길일 때
            if a==pre_loc:
                continue
            # 이 방향으로 이동하면 맵 밖을 벗어날 때
            if a[0] <0 or a[0]>=len(maps) or a[1]<0 or a[1]>=len(maps[0]):
                continue
            # 이 방향으로 이동하면 블록으로 막힐 때
            if maps[a[0]][a[1]]==0:
                continue
            # 이동 가능하긴 한데 이미 계산되었던 방향임
            if record[a[0]][a[1]]:
                # 현재가 비용이 큰 경로라면 현재 경로 중단
                if record[cur_loc[0]][cur_loc[1]] + 1 > record[a[0]][a[1]]:
                    continue

            # 이동해도 되는방향(계산안됐거나, 지금이 최소인 방향)
            possible.append(direction[dir])

        # 현재 위치에서 이동 가능할 때는 이동하자
        if possible:
            go = possible.pop(0)
            # 이동 가능한 길이 두개 이상일 때는 한곳으로만 가고 나머지 보류
            if possible:
                for road in possible:
                    a = [a+b for a,b in zip(cur_loc,road)]
                    # 갈림길이 이미 등록되어있다면
                    if a in cross_road:
                        if cur_loc == cross_road.index(a):
                            continue
                    # 갈림길 추가
                    else:
                        cross_road.append(a)
                        cross_road_pre.append(cur_loc)
                        record[a[0]][a[1]] = record[cur_loc[0]][cur_loc[1]] + 1

            pre_loc = cur_loc
            cur_loc = [a+b for a,b in zip(cur_loc, go)]
            record[cur_loc[0]][cur_loc[1]] = record[pre_loc[0]][pre_loc[1]] + 1

        # 현재 위치에서 이동 가능한 길이 없을 때
        else:
            if not cross_road:
                break
            another = cross_road.pop()
            another_pre = cross_road_pre.pop()
            pre_loc = another_pre
            cur_loc = another

    if record[len(maps)-1][len(maps[0])-1]:
        return record[len(maps)-1][len(maps[0])-1]

    return -1
```

개같넹~~~~ 
