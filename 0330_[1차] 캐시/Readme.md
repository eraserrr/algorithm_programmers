```
def solution(cacheSize, cities):
    answer = 0
    time = []
    cache = []

    # 캐시 사이즈가 0일때는 따로 처리
    if cacheSize==0:
        return len(cities)*5

    for i in range(len(cities)):
        # cache miss
        cities[i] = cities[i].upper()
        if cities[i] not in cache:
            answer += 5
            # 캐시가 덜 찬 상태
            if len(cache) != cacheSize:
                cache.append(cities[i])
                time = [x+1 for x in time] + [1]
                continue
            # 캐시가 찬 상태 (시간 고려해서 넣기)
            exchange_idx = time.index(max(time))
            cache[exchange_idx] = cities[i]
            time = [x + 1 for x in time]
            time[exchange_idx] = 1
            continue

        # cache hit
        answer += 1
        idx = cache.index(cities[i])
        time = [x + 1 for x in time]
        time[idx] = 1

    return answer
```
테스트 1 〉	통과 (0.02ms, 10.2MB)<br>
테스트 2 〉	통과 (0.02ms, 10.3MB)<br>
테스트 3 〉	통과 (0.03ms, 10.1MB)<br>
테스트 4 〉	통과 (0.03ms, 10.1MB)<br>
테스트 5 〉	통과 (0.01ms, 10.2MB)<br>
테스트 6 〉	통과 (0.00ms, 10.3MB)<br>
테스트 7 〉	통과 (0.00ms, 10.2MB)<br>
테스트 8 〉	통과 (0.03ms, 10.2MB)<br>
테스트 9 〉	통과 (0.02ms, 10.2MB)<br>
테스트 10 〉	통과 (0.17ms, 10.4MB)<br>
테스트 11 〉	통과 (235.64ms, 17.7MB)<br>
테스트 12 〉	통과 (0.10ms, 10.3MB)<br>
테스트 13 〉	통과 (0.24ms, 10.3MB)<br>
테스트 14 〉	통과 (0.41ms, 10.3MB)<br>
테스트 15 〉	통과 (0.55ms, 10.2MB)<br>
테스트 16 〉	통과 (0.75ms, 10.3MB)<br>
테스트 17 〉	통과 (0.00ms, 10.3MB)<br>
테스트 18 〉	통과 (1.60ms, 10.2MB)<br>
테스트 19 〉	통과 (2.39ms, 10.4MB)<br>
테스트 20 〉	통과 (2.84ms, 10.1MB)<br>
