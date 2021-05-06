```
from itertools import permutations

def check(a,b):
    if len(a)!=len(b):
        return False
    x = ''
    y = ''
    for i in range(len(a)):
        if a[i] != '*':
            x += a[i]
            y += b[i]
    if x==y:
        return True
    return False


def solution(user_id, banned_id):
    matched = []

    for i in permutations(user_id, len(banned_id)):
        matching = True
        for x,y in zip(banned_id, i):
            if not check(x,y):
                matching = False
                break
        if matching:
            if set(i) not in [set(x) for x in matched]:
                matched.append(i)

    return len(matched)
```

user_id 의 최대 수는 8개이다.

딱히 풀 방법이 떠오르지않아 문제를 못 풀었다.

그런데 최대 수가 적기 때문에,

모든 경우의 수를 일일이 계산한다 치더라도

8! = 40320 이며, 안족의 for문은 최대 8일 것이므로

8 * 8! 로 풀어도 괜찮은 문제였다.

시간복잡도를 좀 어려워하는 것 같다!! ㅠㅠ

그래서 모든 경우의 수를 구하여 푸는 방법은 이렇다.

제재 아이디 수만큼의 순열을 구한다.

그런다음에 그 순열이 제재 아이디 목록과 일치할 시에는

mathced 리스트에 넣어준다.

이 때, 만약에 [frodo crodo] 가 있는데 [crodo frodo] 를 넣으면 중복되는 경우이기 때문에,

matched 리스트에 넣어주기 전에, 순서가 상관없는 set 자료구조를 이용해서 중복되지 않는 경우인지 확인해준다.

matched 리스트는 되는 경우의 수를 모두 넣은 리스트이기 때문에, matched 리스트의 개수를 반환해주면 된다.
