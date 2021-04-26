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


4.26


일단 먼저 
1. 기존 scoville 정렬
2. 앞의 두 숫자 계산해서 pop,추가
3. 앞의 숫자가 K보다 작을때까지 1,2번을 반복


이런 알고리즘으로 문제를 풀게 되면

문제에서 scoville 의 개수가 최대 1000,000 개이므로 정렬하는데 n, 리스트를 삽입,삭제하는데에 n 이 걸린다.

이런 식으로 채점을 해보았을 때에느 효율성에서 걸렸다

그런데 이 문제를 풀기위해서는 어쨋든 계산 한번한번마다 요소를 삽입해야하고, 최솟값을 구하는 과정을 생략할 수가 없다.

계속 해봤는데 딱히 떠오르지 않아서 답을 보았다.

heapq 를 이용하여 문제를 푼 사람이 많았다. 그래서 heaq에 대해서 공부하였다.

자료구조 heap 은 최댓값, 최솟값을 빠르게 찾기 위해 고안되었다. 완전이진트리 형태이다.

이중 파이썬에서 쓸수있는 heapq 모듈은 최소 heap 형태이다.

heap 을 이용하면, 정렬을 하는데에 O(logN) 이 걸린다.

최솟값은 루트 노드이므로 최솟값을 찾는 것은 O(1) 이다.

따라서 이 문제를 O(logN) 으로 풀 수 있다. 


```
import heapq
def solution(scoville, K):
    answer = 0
    heapq.heapify(scoville)
    print(scoville)
    while(scoville[0]< K):
        if len(scoville)<=1:
            return -1
        answer += 1
        heapq.heappush(scoville, heapq.heappop(scoville) + heapq.heappop(scoville)*2)
        print(scoville)


    return answer

print(solution([10,12,1,2,3,9], 7))
```


heaq 없이 큐 이용해서 푼 코드!!
```
def solution(scoville, K):
    answer = 0
    scoville = sorted(scoville, reverse=True)
    min_scoville = scoville[-1]
    second_scoville = scoville[-2]
    mix_S = []
    while min_scoville < K:
        if len(scoville) <= 1:
            answer = -1
            break
        else:
            answer += 1
            scoville.pop(-1)
            scoville.pop(-1)
            mix_scoville = min_scoville + (second_scoville * 2)

            if mix_S == []:
                min_mix_S = mix_scoville
                mix_S = [mix_scoville]
            else:
                mix_S.append(mix_scoville)

            if len(scoville) > 1:
                min_scoville = scoville[-1]
                second_scoville = scoville[-2]

                if min_mix_S < second_scoville:
                    scoville = scoville + mix_S
                    scoville = sorted(scoville, reverse=True)

                    mix_S = []

                    min_scoville = scoville[-1]
                    second_scoville = scoville[-2]
            else:
                scoville = scoville + mix_S
                scoville = sorted(scoville, reverse=True)

                mix_S = []

                if len(scoville) >= 2:
                    min_scoville = scoville[-1]
                    second_scoville = scoville[-2]
                else:
                    min_scoville = scoville[-1]
    return answer

```
