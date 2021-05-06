```
def solution(new_id):
    answer = ''

    # 1단계
    new_id = new_id.lower()
    print('1 ',new_id)

    # 2단계
    available = ['-', '_', '.']
    tmp = ''
    for c in new_id:
        if c in available or c.isdigit() or c.islower():
            tmp += c
    new_id = tmp
    print('2', new_id)

    # 3단계
    while True:
        idx = new_id.find('..')
        if idx == -1:
            break
        new_id = new_id[:idx] + new_id[idx+1:]
    print('3 ',new_id)

    # 4단계
    if new_id and new_id[-1]=='.':
        new_id = new_id[:-1]

    if new_id and new_id[0]=='.':
        new_id = new_id[1:]
    # print('4 ',new_id)

    # 5단계
    if not new_id:
        new_id = 'a'

    # 6단계
    if len(new_id) >=16:
        new_id = new_id[:15]
    if new_id[-1]=='.':
        new_id = new_id[:-1]
    # print('6', new_id)

    # 7단계
    if len(new_id) <= 2:
        new_id += (new_id[-1]*(3-len(new_id)))
    # print('7', new_id)

    return new_id

print(solution("...!@BaT#*..y.abcdefghijklm"))
```
테스트 1 〉	통과 (0.01ms, 10.3MB)<br>
테스트 2 〉	통과 (0.01ms, 10.4MB)<br>
테스트 3 〉	통과 (0.02ms, 10.2MB)<br>
테스트 4 〉	통과 (0.01ms, 10.3MB)<br>
테스트 5 〉	통과 (0.01ms, 10.2MB)<br>
테스트 6 〉	통과 (0.01ms, 10.2MB)<br>
테스트 7 〉	통과 (0.01ms, 10.3MB)<br>
테스트 8 〉	통과 (0.01ms, 10.3MB)<br>
테스트 9 〉	통과 (0.01ms, 10.3MB)<br>
테스트 10 〉	통과 (0.01ms, 10.3MB)<br>
테스트 11 〉	통과 (0.01ms, 10.3MB)<br>
테스트 12 〉	통과 (0.03ms, 10.3MB)<br>
테스트 13 〉	통과 (0.02ms, 10.2MB)<br>
테스트 14 〉	통과 (0.02ms, 10.3MB)<br>
테스트 15 〉	통과 (0.02ms, 10.3MB)<br>
테스트 16 〉	통과 (0.04ms, 10.2MB)<br>
테스트 17 〉	통과 (0.11ms, 10.3MB)<br>
테스트 18 〉	통과 (0.17ms, 10.3MB)<br>
테스트 19 〉	통과 (0.44ms, 10.3MB)<br>
테스트 20 〉	통과 (0.25ms, 10.3MB)<br>
테스트 21 〉	통과 (0.44ms, 10.1MB)<br>
테스트 22 〉	통과 (0.23ms, 10.2MB)<br>
테스트 23 〉	통과 (0.62ms, 10.4MB)
테스트 24 〉	통과 (0.22ms, 10.2MB)
테스트 25 〉	통과 (0.55ms, 10.2MB)
테스트 26 〉	통과 (0.56ms, 10.1MB)
