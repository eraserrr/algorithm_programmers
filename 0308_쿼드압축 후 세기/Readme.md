```
def compress_or_recursion(arr, r_s, r_e, c_s, c_e):
    zero = 0
    one = 0
    quad = [row[c_s:c_e] for row in arr[r_s:r_e]]
    S = [x for row in arr[r_s:r_e] for x in row[c_s:c_e]]
    if len(set(S)) == 1:
        if S[0] == 0:
            zero += 1
        else:
            one += 1
    else:
        a, b = divide(quad)
        zero += a
        one += b
    return zero, one

def divide(arr):
    if len(arr)==1:
        return 0,0
    zero = 0
    one = 0
    a,b = compress_or_recursion(arr, 0, len(arr)//2, 0, len(arr)//2)
    zero += a
    one += b
    a,b = compress_or_recursion(arr, 0, len(arr)//2, len(arr)//2, len(arr))
    zero += a
    one += b
    a,b = compress_or_recursion(arr, len(arr)//2, len(arr), len(arr)//2, len(arr))
    zero += a
    one += b
    a,b = compress_or_recursion(arr, len(arr)//2, len(arr), 0,len(arr)//2)
    zero += a
    one += b
    return zero, one



def solution(arr):
    answer = []

    return compress_or_recursion(arr, 0, len(arr), 0, len(arr))
```
테스트 1 〉	통과 (1.95ms, 10.4MB)<br>
테스트 2 〉	통과 (1.66ms, 10.3MB)<br>
테스트 3 〉	통과 (0.62ms, 10.3MB)<br>
테스트 4 〉	통과 (0.17ms, 10.3MB)<br>
테스트 5 〉	통과 (516.79ms, 17.5MB)<br>
테스트 6 〉	통과 (157.45ms, 17.6MB)<br>
테스트 7 〉	통과 (83.42ms, 17.6MB)<br>
테스트 8 〉	통과 (41.87ms, 17.5MB)<br>
테스트 9 〉	통과 (33.92ms, 17.6MB)<br>
테스트 10 〉	통과 (44.96ms, 35.4MB)<br>
테스트 11 〉	통과 (0.10ms, 10.3MB)<br>
테스트 12 〉	통과 (0.15ms, 10.3MB)<br>
테스트 13 〉	통과 (30.25ms, 17.4MB)<br>
테스트 14 〉	통과 (209.02ms, 40MB)<br>
테스트 15 〉	통과 (307.01ms, 40MB)<br>
테스트 16 〉	통과 (127.16ms, 18.2MB)<br>
