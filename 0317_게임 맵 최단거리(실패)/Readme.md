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
