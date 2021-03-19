```
def solution(arr1, arr2):
    answer = []
    
    for i in range(len(arr1)):
        tmp = []
        for j in range(len(arr2[0])):
            a = 0
            for k in range(len(arr1[0])):
                a += arr1[i][k] * arr2[k][j]
            tmp.append(a)
        answer.append(tmp)

    return answer
```
테스트 1 〉	통과 (3.56ms, 10.3MB)<br>
테스트 2 〉	통과 (58.99ms, 11MB)<br>
테스트 3 〉	통과 (64.19ms, 11.4MB)<br>
테스트 4 〉	통과 (1.79ms, 10.2MB)<br>
테스트 5 〉	통과 (43.01ms, 11MB)<br>
테스트 6 〉	통과 (25.10ms, 11MB)<br>
테스트 7 〉	통과 (1.58ms, 10.2MB)<br>
테스트 8 〉	통과 (0.91ms, 10.2MB)<br>
테스트 9 〉	통과 (0.83ms, 10.3MB)<br>
테스트 10 〉	통과 (43.04ms, 10.9MB)<br>
테스트 11 〉	통과 (4.72ms, 10.5MB)<br>
테스트 12 〉	통과 (1.14ms, 10.4MB)<br>
테스트 13 〉	통과 (32.27ms, 10.9MB)<br>
테스트 14 〉	통과 (65.62ms, 11.2MB)<br>
테스트 15 〉	통과 (20.44ms, 10.7MB)<br>
테스트 16 〉	통과 (6.72ms, 10.7MB)<br>
