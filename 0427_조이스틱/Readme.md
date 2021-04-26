```
def solution(name):
    answer = 0
    alph = []
    for n in name:
        alph.append(min(ord(n)-ord('A'), ord('Z')-ord(n)+1))
    num = 0
    max_idx = -1
    idx = -1
    x = 0
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

    # 돌아감, 안돌아감
    a = alph[:max_idx-1]*2 + alph[max_idx+num:]
    b = alph
    answer = min(sum(alph[:max_idx] + alph[max_idx+num:])+len(a),sum(b)+len(b)-1)

    return answer

print(solution("JEROEN"))
```
