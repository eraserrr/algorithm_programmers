```
def solution(s):
    len_min = len(s)
    for unit in range(1, int(len(s)/2)+1):
        compressed = len(s)
        for i in range(len(s)-unit):
            # 탐색을 할 부분문자열의 위치
            idx = i+unit
            num = 0
            while(s[idx:].find(s[i:i+unit])==0):
                idx += unit
                num += 1

            if num >0:
                compressed = compressed - num * unit + 1
            i += unit*(num+1)
        if compressed < len_min:
            len_min = compressed
    return len_min
```

4.24 

```
def solution(s):
    answer = len(s)
    origin = s
    for unit in range(1,len(s)//2+1):
        # print(unit, '단위')
        s = origin
        idx = unit
        created = ''
        pattern = s[:unit]
        cnt = 0
        while(idx <= len(s)):
            if pattern==s[idx:idx+unit]:
                cnt += 1
            else:
                if cnt:
                    created += str(cnt+1) + pattern
                    cnt = 0
                else:
                    created += pattern
                pattern = s[idx:idx+unit]
            idx += unit

        # print(created+pattern)
        if len(created+pattern)<answer:
            answer = len(created+pattern)
    return answer
```
테스트 1 〉	통과 (0.04ms, 10.1MB)<br>
테스트 2 〉	통과 (0.57ms, 10.3MB)<br>
테스트 3 〉	통과 (0.28ms, 10.3MB)<br>
테스트 4 〉	통과 (0.04ms, 10.2MB)<br>
테스트 5 〉	통과 (0.00ms, 10.2MB)<br>
테스트 6 〉	통과 (0.05ms, 10.3MB)<br>
테스트 7 〉	통과 (0.74ms, 10.2MB)<br>
테스트 8 〉	통과 (0.76ms, 10.1MB)<br>
테스트 9 〉	통과 (1.06ms, 10.3MB)<br>
테스트 10 〉	통과 (3.04ms, 10.2MB)<br>
테스트 11 〉	통과 (0.13ms, 10.2MB)<br>
테스트 12 〉	통과 (0.13ms, 10.2MB)<br>
테스트 13 〉	통과 (0.16ms, 10.3MB)<br>
테스트 14 〉	통과 (1.05ms, 10.2MB)<br>
테스트 15 〉	통과 (0.16ms, 10.2MB)<br>
테스트 16 〉	통과 (0.02ms, 10.2MB)<br>
테스트 17 〉	통과 (1.60ms, 10.3MB)<br>
테스트 18 〉	통과 (1.54ms, 10.2MB)<br>
테스트 19 〉	통과 (1.61ms, 10.3MB)<br>
테스트 20 〉	통과 (3.11ms, 10.2MB)<br>
테스트 21 〉	통과 (3.21ms, 10.2MB)<br>
테스트 22 〉	통과 (3.00ms, 10.1MB)<br>
테스트 23 〉	통과 (2.99ms, 10.2MB)<br>
테스트 24 〉	통과 (4.20ms, 10.2MB)<br>
테스트 25 〉	통과 (3.24ms, 10.2MB)<br>
테스트 26 〉	통과 (3.06ms, 10.2MB)<br>
테스트 27 〉	통과 (3.21ms, 10.3MB)<br>
테스트 28 〉	통과 (0.02ms, 10.4MB)<br>
