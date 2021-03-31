```
def solution(record):
    kinds = {'Enter': '들어왔습니다.', 'Leave':'나갔습니다.','Change':''}

    answer = []

    info = {}

    # 어차피 마지막껄로 하면 되니까 거꾸로 하면서 저장
    for i in range(len(record)-1, -1, -1):
        inp = record[i].split(' ')
        kind = inp[0]
        user_id = inp[1]
        user_nick = ''
        if len(inp)==3:
            user_nick = inp[2]

        # 등록안된 유저일 때만 닉네임 저장
        if kind != 'Leave' and user_id not in info.keys():
            if user_id not in info.keys():
                info[user_id] = user_nick

    for i in range(0, len(record)):
        inp = record[i].split(' ')
        kind = inp[0]
        user_id = inp[1]

        # change 제외하고 문자열 저장
        if kinds[kind]:
            msg = info[user_id] + '님이 ' + kinds[kind]
            answer.append(msg)

    return answer

```

테스트 1 〉	통과 (0.02ms, 10.4MB)<br>
테스트 2 〉	통과 (0.03ms, 10.3MB)<br>
테스트 3 〉	통과 (0.08ms, 10.1MB)<br>
테스트 4 〉	통과 (0.07ms, 10.4MB)<br>
테스트 5 〉	통과 (1.24ms, 10.7MB)<br>
테스트 6 〉	통과 (1.19ms, 10.4MB)<br>
테스트 7 〉	통과 (1.03ms, 10.2MB)<br>
테스트 8 〉	통과 (1.27ms, 10.6MB)<br>
테스트 9 〉	통과 (1.45ms, 10.6MB)<br>
테스트 10 〉	통과 (1.29ms, 10.3MB)<br>
테스트 11 〉	통과 (1.04ms, 10.1MB)<br>
테스트 12 〉	통과 (0.95ms, 10.3MB)<br>
테스트 13 〉	통과 (1.32ms, 10.4MB)<br>
테스트 14 〉	통과 (1.33ms, 10.5MB)<br>
테스트 15 〉	통과 (0.02ms, 10.3MB)<br>
테스트 16 〉	통과 (0.02ms, 10.1MB)<br>
테스트 17 〉	통과 (0.15ms, 10.3MB)<br>
테스트 18 〉	통과 (0.14ms, 10.3MB)<br>
테스트 19 〉	통과 (1.37ms, 10.6MB)<br>
테스트 20 〉	통과 (1.23ms, 10.3MB)<br>
테스트 21 〉	통과 (1.21ms, 10.3MB)<br>
테스트 22 〉	통과 (1.19ms, 10.2MB)<br>
테스트 23 〉	통과 (1.38ms, 10.5MB)<br>
테스트 24 〉	통과 (1.17ms, 10.5MB)<br>
테스트 25 〉	통과 (94.38ms, 47.3MB)<br>
테스트 26 〉	통과 (109.39ms, 49.9MB)<br>
테스트 27 〉	통과 (131.42ms, 50.2MB)<br>
테스트 28 〉	통과 (135.32ms, 51.5MB)<br>
테스트 29 〉	통과 (140.93ms, 51.5MB)<br>
테스트 30 〉	통과 (97.12ms, 44.5MB)<br>
테스트 31 〉	통과 (115.89ms, 52MB)<br>
테스트 32 〉	통과 (87.48ms, 47.5MB)<br>
