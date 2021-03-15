```
def solution(s):
    solution = []
    a = [x.split(',') for x in s[2:-2].split('},{') ]
    for i in range(len(a)):
         a[i] = [int(x) for x in a[i]]
    a.sort(key=lambda x:len(x))
    solution.append(sum(a[0]))
    for s in range(len(a)-1):
        num = sum(a[s+1]) - sum(a[s])
        solution.append(num)
    return solution
```
테스트 1 〉	통과 (0.04ms, 10.3MB)<br>
테스트 2 〉	통과 (0.03ms, 10.4MB)<br>
테스트 3 〉	통과 (0.03ms, 10.4MB)<br>
테스트 4 〉	통과 (0.06ms, 10.3MB)<br>
테스트 5 〉	통과 (0.27ms, 10.4MB)<br>
테스트 6 〉	통과 (0.64ms, 10.5MB)<br>
테스트 7 〉	통과 (4.86ms, 11.9MB)<br>
테스트 8 〉	통과 (13.30ms, 15MB)<br>
테스트 9 〉	통과 (6.65ms, 12.5MB)<br>
테스트 10 〉	통과 (14.32ms, 15.7MB)<br>
테스트 11 〉	통과 (19.34ms, 17.1MB)<br>
테스트 12 〉	통과 (25.58ms, 20.4MB)<br>
테스트 13 〉	통과 (26.70ms, 20MB)<br>
테스트 14 〉	통과 (26.30ms, 20.5MB)<br>
테스트 15 〉	통과 (0.03ms, 10.4MB)<br>
