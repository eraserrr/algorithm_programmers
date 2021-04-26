계산을 하다보니까

조이스틱을 가장 적게 돌리는 경로는 A 구간을 피하는 것인것같았고,

A 구간 중에서도, 가장 넓은 A 구간을 돌아가느냐, 통과해서 가느냐에 따라 달린 것 같아서 코드를 짰다.

(하나의 A 구간 이외의 구간은 어차피 다 통과해야하기 때문에, 비용을 줄일 수 있도록 최대한 넓은 A 구간을 피하려는 것)

```
def solution(name):
    answer = 0
    
    # name의 문자마다 위,아래 비용계산
    alph = []
    for n in name:
        alph.append(min(ord(n)-ord('A'), ord('Z')-ord(n)+1))
    
    # 최대 A 구간 개수
    num = 0
    # 최대 A 구간 인덱스
    max_idx = -1
    
    idx = -1
    x = 0
    
    # A 구멍이 제일 크게 뚫려있는 부분 찾기
    for i in range(len(name)):
        if name[i]=='A':
            if x==0:
                idx = i
            x += 1

        if x and name[i]!='A':
            if num < x:
                num = x
                max_idx = idx
            x = 0

    # 가장 큰 A 구멍을 우회해서 가기
    a = alph[:max_idx-1]*2 + alph[max_idx+num:]
    # 가장 큰 A 구멍을 지나쳐서 가기
    b = alph
    answer = min(sum(alph[:max_idx] + alph[max_idx+num:])+len(a),sum(b)+len(b)-1)

    return answer
```
