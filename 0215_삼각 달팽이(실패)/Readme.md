```
def solution(n):
    tri = [[-1]*n for j in range(n)]
    print(tri)
    num = 1
    top = -1
    bot = n+1
    s = -1
    e = n+1
    print('------------------')
    while top < bot:
        # 1단계
        top += 2
        bot -= 1
        s += 1
        e -= 1

        for i in range(top, bot):
            # i 는 현재 층
            tri[i-1][s] = num
            num += 1

        for i in range(s, e+1):
            tri[bot-1][i] = num
            num += 1

        for i in range(bot-1, top, -1):
            tri[i-1][i-1] = num
            num += 1

        print('==========')
        for i in range(n):
            print(tri[i])
        print('==========')
    s = []
    for i in range(n):
        idx = 0
        while(idx < n and tri[i][idx]!= -1):
            s.append(tri[i][idx])
            idx +=1
    return s
```
실패
