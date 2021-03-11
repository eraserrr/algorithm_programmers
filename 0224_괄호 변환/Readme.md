```
def concat_s(s):
    if s == '':
        return ''

    left = 0
    right = 0
    st = []
    idx = 0

    for c in s:
        idx += 1
        if c == '(':
            left += 1
            st.append(0)
        elif c == ')':
            right += 1
            if st:
                st.pop()
        if left == right:
            break

    # 3-1 올바른 문자열
    if len(st) == 0:
        return s[:idx] + concat_s(s[idx:])
    else:
        return trans_s(s[:idx], concat_s(s[idx:]))


def trans_s(u, v):
    tmp = '(' + v + ')'
    for c in u[1:-1]:
        if c=='(':
            tmp += ')'
        if c==')':
            tmp += '('
    return tmp

def solution(p):
    answer = concat_s(p)
    return answer
```
테스트 1 〉	통과 (0.01ms, 10.2MB)<br>
테스트 2 〉	통과 (0.01ms, 10.2MB)<br>
테스트 3 〉	통과 (0.01ms, 10.3MB)<br>
테스트 4 〉	통과 (0.01ms, 10.2MB)<br>
테스트 5 〉	통과 (0.01ms, 10.3MB)<br>
테스트 6 〉	통과 (0.01ms, 10.3MB)<br>
테스트 7 〉	통과 (0.01ms, 10.2MB)<br>
테스트 8 〉	통과 (0.01ms, 10.3MB)<br>
테스트 9 〉	통과 (0.02ms, 10.3MB)<br>
테스트 10 〉	통과 (0.01ms, 10.2MB)<br>
테스트 11 〉	통과 (0.03ms, 10.3MB)<br>
테스트 12 〉	통과 (0.04ms, 10.3MB)<br>
테스트 13 〉	통과 (0.04ms, 10.3MB)<br>
테스트 14 〉	통과 (0.08ms, 10.2MB)<br>
테스트 15 〉	통과 (0.10ms, 10.2MB)<br>
테스트 16 〉	통과 (0.28ms, 10.4MB)<br>
테스트 17 〉	통과 (0.19ms, 10.4MB)<br>
테스트 18 〉	통과 (0.30ms, 10.3MB)<br>
테스트 19 〉	통과 (0.49ms, 10.3MB)<br>
테스트 20 〉	통과 (0.39ms, 10.3MB)<br>
테스트 21 〉	통과 (0.39ms, 10.3MB)<br>
테스트 22 〉	통과 (0.22ms, 10.3MB)<br>
테스트 23 〉	통과 (0.33ms, 10.1MB)<br>
테스트 24 〉	통과 (0.12ms, 10.2MB)<br>
테스트 25 〉	통과 (0.19ms, 10.3MB)<br>
