```
# # answer 리스트 마다 user id 를 기록
# recorded_id = []
# # 들어왔던 user 인지 체크하기 위한 리스트
# visited_id = []
# # 들어왔던 user 마다 현재 닉네임
# visited_nick = []
# answer = []
#
# def enter(user_id, user_nick):
#     record = user_nick + '님이 들어왔습니다.'
#
#     # 이미 들어온 유저일때
#     if user_id in visited_id:
#         idx = visited_id.index(user_id)
#         # 닉네임을 변경한 채로 들어옴
#         if user_nick != visited_nick[idx]:
#             # 등록되어있는 닉네임 변경
#             visited_nick[idx] = user_nick
#             # 모든 기록 변경하기
#             change(user_id, user_nick)
#             # 기록 남기기
#
#     # 들어온 적 없는 유저일때
#     else:
#         visited_id.append(user_id)
#         visited_nick.append(user_nick)
#
#     answer.append(record)
#     recorded_id.append(user_id)
#
#
# def leave(user_id, user_nick):
#     record = user_id + '님이 나갔습니다.'
#     answer.append(record)
#     recorded_id.append(user_id)
#
# def change(user_id, user_nick):
#     idx = visited_id.index(user_id)
#     visited_nick[idx] = user_nick
#
#     for i in range(len(recorded_id)):
#         # 기록 변경
#         if recorded_id[i] == user_id:
#             answer[i] = user_nick + '님' + answer[i].split('님')[1]
#
# def solution(record):
#
#     kinds = {"Enter": enter, "Leave": leave, "Change": change}
#
#     for i in range(len(record)):
#         inp = record[i].split(' ')
#
#         kind = inp[0]
#         user_id = inp[1]
#         user_nick = ''
#         if len(inp)==3:
#             user_nick = inp[2]
#
#         kinds[kind](user_id, user_nick)
#
#     return answer
#

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
