```
def solution(number, k):
    answer = ''
    ind = number.index(maxstr(number[:k+1]))
    while ind < k:
        answer += max(number[ind:k+1])
        ind= number[ind:].index(max(number[ind:k+1])) + ind + 1
        k += 1
        if k==len(number):
            break
    
    return answer + number[k:]
```

실패

4.26

```
def solution(number, k):
    k = len(number)-k
    answer = number[0]
    for i in range(1,len(number)):
        if number[i]>number[i-1]:
            while len(answer)>=1 and number[i]>answer[-1] and (len(answer)+len(number)-i-1)>=k:
                answer = answer[:-1]
        answer += number[i]

    return answer[:k]
```
테스트 1 〉	통과 (0.01ms, 10.1MB)<br>
테스트 2 〉	통과 (0.02ms, 10.2MB)<br>
테스트 3 〉	통과 (0.07ms, 10.2MB)<br>
테스트 4 〉	통과 (0.40ms, 10.2MB)<br>
테스트 5 〉	통과 (0.69ms, 10.2MB)<br>
테스트 6 〉	통과 (8.09ms, 10.3MB)<br>
테스트 7 〉	통과 (20.59ms, 10.3MB)<br>
테스트 8 〉	통과 (44.11ms, 10.3MB)<br>
테스트 9 〉	통과 (86.71ms, 11.7MB)<br>
테스트 10 〉	통과 (322.43ms, 11.6MB)<br>
테스트 11 〉	통과 (0.01ms, 10.1MB)<br>
테스트 12 〉	통과 (0.01ms, 10.3MB)<br>
