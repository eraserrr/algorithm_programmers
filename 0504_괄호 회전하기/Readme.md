```
def check(s):
    match = {'{':'}', '[':']', '(':')'}

    st = []

    for i in range(len(s)):
        if st and match[st[-1]]==s[i]:
            st.pop()
        elif s[i] in match.keys():
            st.append(s[i])
        else:
            return False
    if not st:
        return True
    return False

def solution(s):
    answer = 0

    for i in range(len(s)):
        if check(s[i:] + s[:i]):
            answer += 1

    return answer

```
테스트 1 〉	통과 (10.41ms, 10.2MB)<br>
테스트 2 〉	통과 (6.11ms, 10.2MB)<br>
테스트 3 〉	통과 (6.58ms, 10.2MB)<br>
테스트 4 〉	통과 (9.54ms, 10.2MB)<br>
테스트 5 〉	통과 (26.82ms, 10.2MB)<br>
테스트 6 〉	통과 (12.15ms, 10.3MB)<br>
테스트 7 〉	통과 (15.69ms, 10.3MB)<br>
테스트 8 〉	통과 (22.61ms, 10.4MB)<br>
테스트 9 〉	통과 (39.12ms, 10.2MB)<br>
테스트 10 〉	통과 (56.95ms, 10.2MB)<br>
테스트 11 〉	통과 (81.34ms, 10.2MB)<br>
테스트 12 〉	통과 (0.01ms, 10.2MB)<br>
테스트 13 〉	통과 (0.01ms, 10.2MB)<br>
테스트 14 〉	통과 (0.01ms, 10.2MB)<br>
