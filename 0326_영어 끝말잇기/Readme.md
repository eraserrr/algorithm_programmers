```
def solution(n, words):
    answer = []
    
    appeared = []

    alph = words[0][0]
    loser = 0
    
    for i in range(len(words)):
        if len(words[i])==1:
            loser = i
            break
        if words[i] in appeared:
            loser = i
            break
        if words[i][0] != alph:
            loser = i
            break
        alph = words[i][-1]
        appeared.append(words[i])
        
    if loser==0:
        return [0,0]
    player = loser % n + 1
    turn = loser//n + 1
    print(player,turn)
    return [player, turn]
```
테스트 1 〉	통과 (0.01ms, 10.2MB)<br>
테스트 2 〉	통과 (0.03ms, 10.2MB)<br>
테스트 3 〉	통과 (0.01ms, 10.2MB)<br>
테스트 4 〉	통과 (0.02ms, 10.2MB)<br>
테스트 5 〉	통과 (0.05ms, 10.2MB)<br>
테스트 6 〉	통과 (0.01ms, 10.2MB)<br>
테스트 7 〉	통과 (0.02ms, 10.2MB)<br>
테스트 8 〉	통과 (0.01ms, 10.2MB)<br>
테스트 9 〉	통과 (0.01ms, 10.2MB)<br>
테스트 10 〉	통과 (0.05ms, 10.1MB)<br>
테스트 11 〉	통과 (0.04ms, 10.3MB)<br>
테스트 12 〉	통과 (0.02ms, 10.1MB)<br>
테스트 13 〉	통과 (0.01ms, 10.1MB)<br>
테스트 14 〉	통과 (0.01ms, 10.2MB)<br>
테스트 15 〉	통과 (0.01ms, 10.2MB)<br>
테스트 16 〉	통과 (0.01ms, 10.2MB)<br>
테스트 17 〉	통과 (0.01ms, 10.2MB)<br>
테스트 18 〉	통과 (0.01ms, 10.2MB)<br>
테스트 19 〉	통과 (0.01ms, 10.2MB)<br>
테스트 20 〉	통과 (0.13ms, 10.2MB)<br>
