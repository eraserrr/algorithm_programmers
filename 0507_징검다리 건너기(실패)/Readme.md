```
def solution(stones, k):
    answer = 0

    num_set = list(set(stones))
    num_set.sort()
    cross_cnt = 0
    for num in num_set:

        while stones.count(num):
            idx = stones.index(num)
            stones[idx] = 0

        cross_cnt = num
        cnt = 0
        x = False
        for i in range(len(stones)):
            if stones[i] != 0:
                cnt = 0
            else:
                cnt += 1
            if cnt>=k:
                x = True
                break
        if x:
            break

    return cross_cnt
```
