```
scoville = [1,2,3,9,10,12]
K = 7

while(True):
    scoville.sort()
    print(scoville)
    if scoville[0]>=K:
        break
    if len(scoville)<2:
        print(-1)
        break
    new = scoville[0]+scoville[1]*2
    
    scoville = scoville[2:]
    print(1, scoville)
    scoville.append(new)
    print(2,scoville)
```
시간초과
```
scoville = [1,1,1]
K = 7

# 정렬한뒤 공식 적용.

scoville.sort()

scrambled = [1000001]
# k 이상인지 검사 -> 맨앞과 그 뒤 공식적용

most = scoville[0]
idx = 0
next = scoville[1]

while(idx+1 < len(scoville)):
    print('인덱스',idx,'에서',most, next, '로 공식 적용')
    scrambled.append(most + next*2)
    a = min(scrambled)

    # 종료 조건. 섞인 값과, 그 다음으로 순한 맛이 K를 넘어섬
    if (most+next*2)>=K and scoville[idx+1]>=K:
        break

    # 만약에 섞은 값이 K보다 작다면 다시 한번 섞기
    if (most + next*2) < K:
        print(most + next*2, '로 다시 한번 ')
        most = most+ next*2
        next = min(a, scoville[idx+2])

    # 그게 아니라면 다음 인덱스로 이동
    else :
        print('다음 인덱스로 이동')
        next = min(a, most)
        most = scoville[idx + 2]
        idx += 2

    if next==a:
        scrambled.remove(a)
```
걍 실패
