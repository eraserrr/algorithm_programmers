```
def solution(priorities, location):
    answer = 0

    priorities = list(zip(priorities, range(len(priorities))))


    while(True):
        answer += 1
        prior_max = priorities.index(max(priorities, key=lambda x:x[0]))
        if priorities[prior_max][1]==location:
            break
        priorities = priorities[prior_max+1:] + priorities[:prior_max]
    return answer

```
