```
def solution(dirs):
    visit = []
    answer = 0
    for i in range(111):
        visit.append([0]*111)
    present = [5,5]

    for dir in dirs:
        a = present[0]*10 + present[1]
        if dir=="U" and present[0]>0:
            present[0] -= 1
            if visit[a][a-10] == 0 and visit[a-10][a] == 0:
                answer += 1
                visit[a][a - 10] = 1
        if dir=="D" and present[0]<10:
            present[0] += 1
            if visit[a][a+10] == 0 and visit[a+10][a] == 0:
                answer += 1
                visit[a][a + 10] = 1
        if dir=="R" and present[1]<10:
            present[1] += 1
            if visit[a][a+1] == 0 and visit[a+1][a] == 0:
                answer += 1
                visit[a][a + 1] = 1
        if dir=="L" and present[1]>0:
            present[1] -= 1
            if visit[a][a-1] == 0 and visit[a-1][a] == 0:
                answer += 1
                visit[a][a - 1] = 1
    return answer
```
테스트 1 〉	실패 (0.14ms, 10.4MB)<br>
테스트 2 〉	통과 (0.12ms, 10.4MB)<br>
테스트 3 〉	통과 (0.12ms, 10.4MB)<br>
테스트 4 〉	실패 (0.20ms, 10.4MB)<br>
테스트 5 〉	실패 (0.20ms, 10.2MB)<br>
테스트 6 〉	통과 (0.15ms, 10.3MB)<br>
테스트 7 〉	통과 (0.13ms, 10.3MB)<br>
테스트 8 〉	통과 (0.15ms, 10.3MB)<br>
테스트 9 〉	통과 (0.14ms, 10.3MB)<br>
테스트 10 〉	통과 (0.14ms, 10.2MB<br>)
테스트 11 〉	통과 (0.14ms, 10.3MB)<br>
테스트 12 〉	통과 (0.17ms, 10.2MB)<br>
테스트 13 〉	통과 (0.18ms, 10.4MB)<br>
테스트 14 〉	통과 (0.18ms, 10.2MB)<br>
테스트 15 〉	통과 (0.17ms, 10.2MB)<br>
테스트 16 〉	통과 (0.39ms, 10.4MB)<br>
테스트 17 〉	통과 (0.39ms, 10.3MB)<br>
테스트 18 〉	실패 (0.40ms, 10.4MB)<br>
테스트 19 〉	실패 (0.39ms, 10.3MB)<br>
테스트 20 〉	실패 (0.39ms, 10.3MB)<br>
