파이썬에서 10진수를 n진수를 바꾸기 위해서는 별도의 함수 구현이 필요하다 


단 밑의 convert 함수는 16진수까지 가능


```
def convert(n, base) :
    t = '0123456789ABCDEF'
    q,r  = divmod(n, base)
    if q==0:
        return t[r]
    else:
        return convert(q,base) + t[r]

def solution(n, t, m, p):
    answer = ''

    # next : 다음 자릿수
    next = 1

    tmp = '0'

    while(True):
        # 현재 자릿수에서 생긴 문자열을 tmp 에 저장
        for i in range(next,next*n):
            tmp += convert(i, n)
        if len(tmp)>=t*m:
            tmp = tmp[:t*m]
            break
        next *= n



    return tmp[p-1::m]
```
테스트 1 〉	통과 (0.01ms, 10.2MB)<br>
테스트 2 〉	통과 (0.11ms, 10.1MB)<br>
테스트 3 〉	통과 (0.11ms, 10.3MB)<br>
테스트 4 〉	통과 (0.11ms, 10.2MB)<br>
테스트 5 〉	통과 (0.30ms, 10.2MB)<br>
테스트 6 〉	통과 (0.30ms, 10.3MB)<br>
테스트 7 〉	통과 (0.31ms, 10.1MB)<br>
테스트 8 〉	통과 (0.81ms, 10.2MB)<br>
테스트 9 〉	통과 (0.78ms, 10.1MB)<br>
테스트 10 〉	통과 (0.83ms, 10.2MB)<br>
테스트 11 〉	통과 (0.20ms, 10.2MB)<br>
테스트 12 〉	통과 (0.20ms, 10.2MB)<br>
테스트 13 〉	통과 (0.23ms, 10.2MB)<br>
테스트 14 〉	통과 (52.10ms, 10.3MB)<br>
테스트 15 〉	통과 (53.25ms, 10.3MB)<br>
테스트 16 〉	통과 (52.05ms, 10.3MB)<br>
테스트 17 〉	통과 (1.44ms, 10.2MB)<br>
테스트 18 〉	통과 (3.19ms, 10.2MB)<br>
테스트 19 〉	통과 (1.55ms, 10.1MB)<br>
테스트 20 〉	통과 (2.70ms, 10.2MB)<br>
테스트 21 〉	통과 (41.06ms, 10.3MB)<br>
테스트 22 〉	통과 (3.74ms, 10.2MB)<br>
테스트 23 〉	통과 (23.77ms, 10.3MB)<br>
테스트 24 〉	통과 (34.25ms, 10.3MB)<br>
테스트 25 〉	통과 (20.40ms, 10.3MB)<br>
테스트 26 〉	통과 (30.58ms, 10.3MB)<br>
