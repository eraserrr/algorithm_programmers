```
def solution(skill, skill_trees):
    answer = 0
    for skill_tree in skill_trees:
        li = []
        for c in skill_tree:
            if c in skill:
                li.append(skill.index(c))
        if li == []:
            answer += 1
            continue
        if li[0]!=0:
            continue
        print(li)
        treed = True
        
        for x in range(len(li)-1):
            if li[x] != li[x+1] and li[x]+1 != li[x+1]:
                treed = False
                break

        if treed:
            print(li)
            answer += 1

    return answer
```

테스트 1 〉	통과 (0.02ms, 10.2MB)<br>
테스트 2 〉	통과 (0.03ms, 10.2MB)<br>
테스트 3 〉	통과 (0.03ms, 10.2MB)<br>
테스트 4 〉	통과 (0.03ms, 10.3MB)<br>
테스트 5 〉	통과 (0.04ms, 10.3MB)<br>
테스트 6 〉	통과 (0.03ms, 10.3MB)<br>
테스트 7 〉	통과 (0.03ms, 10.3MB)<br>
테스트 8 〉	통과 (0.03ms, 10.2MB)<br>
테스트 9 〉	통과 (0.03ms, 10.3MB)<br>
테스트 10 〉	통과 (0.03ms, 10.2MB)<br>
테스트 11 〉	통과 (0.04ms, 10.2MB)<br>
테스트 12 〉	통과 (0.05ms, 10.2MB)<br>
테스트 13 〉	통과 (0.03ms, 10.2MB)<br>
테스트 14 〉	통과 (0.03ms, 10.2MB)<br>
