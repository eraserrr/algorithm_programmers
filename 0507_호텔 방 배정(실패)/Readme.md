```
import bisect
def solution(k, room_number):
    answer = []
    assigned = []

    for request in room_number:
        possible = request
        # print('=>', possible, assigned)
        while(assigned.count(possible)):
            possible += 1
            # print((possible))

        answer.append(possible)
        assigned.append(possible)
        assigned.sort()

    return answer
```
