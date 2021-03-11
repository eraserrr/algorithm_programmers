```
def gcd(x, y):
    while y:
        x,y = y, x%y
    return x
def f_x(h,w,x):
    return (h/w)*x
def solution(w,h):
    pre = [0,0]
    answer = 0
    a = min(w,h)
    g = gcd(w,h)
    for x in range(1,int(a/g)+1):
        y = f_x(h,w,x)

        # 차이가 자연수?
        if y-pre[1]==int(y-pre[1]):
            answer += int(y-pre[1])
        else:
            answer += int(y-pre[1] +1)
        pre = [x,y]
    answer = answer * g
    return w*h - answer
```
테스트 1 〉	통과 (0.01ms, 10.2MB)<br>
테스트 2 〉	실패 (4.15ms, 10.1MB)<br>
테스트 3 〉	실패 (0.59ms, 10.2MB)<br>
테스트 4 〉	실패 (0.15ms, 10.2MB)<br>
테스트 5 〉	실패 (0.07ms, 10.2MB)<br>
테스트 6 〉	실패 (1.20ms, 10.2MB)<br>
테스트 7 〉	통과 (0.01ms, 10.2MB)<br>
테스트 8 〉	통과 (0.01ms, 10.3MB)<br>
테스트 9 〉	통과 (0.01ms, 10.2MB)<br>
테스트 10 〉	실패 (0.01ms, 10.2MB)<br>
테스트 11 〉	실패 (0.01ms, 10.3MB)<br>
테스트 12 〉	통과 (0.01ms, 10.2MB)<br>
테스트 13 〉	실패 (299.13ms, 10.1MB)<br>
테스트 14 〉	통과 (0.01ms, 10.2MB)<br>
테스트 15 〉	실패 (6723.50ms, 10.2MB)<br>
테스트 16 〉	실패 (42.49ms, 10.3MB)<br>
테스트 17 〉	실패 (1564.13ms, 10.3MB)<br>
테스트 18 〉	통과 (0.01ms, 10.2MB)<br>
