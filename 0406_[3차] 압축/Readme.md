```
def solution(msg):
    answer = []

    dic= {}
    i= 1
    for x in range(ord('A'), ord('Z')+1):
        dic[chr(x)] = i
        i += 1

    idx = 0
    new =  1

    while(new<=len(msg)):
        if msg[idx:new+1] in dic.keys():
            new += 1
            continue
        # print('출력:',msg[idx:new], '등록', msg[idx:new+1])
        answer.append(dic[msg[idx:new]])
        dic[msg[idx:new+1]] = len(dic.keys())+1
        idx = new
    answer.append(dic[msg[idx:new+1]])

    return answer
    
```
테스트 1 〉	통과 (0.02ms, 10.2MB)<br>
테스트 2 〉	통과 (0.04ms, 10.2MB)<br>
테스트 3 〉	통과 (0.02ms, 10.2MB)<br>
테스트 4 〉	통과 (0.41ms, 10.3MB)<br>
테스트 5 〉	통과 (0.04ms, 10.2MB)<br>
테스트 6 〉	통과 (0.67ms, 10.2MB)<br>
테스트 7 〉	통과 (0.58ms, 10.2MB)<br>
테스트 8 〉	통과 (0.57ms, 10.2MB)<br>
테스트 9 〉	통과 (0.01ms, 10.3MB)<br>
테스트 10 〉	통과 (0.57ms, 10.2MB)<br>
테스트 11 〉	통과 (0.42ms, 10.2MB)<br>
테스트 12 〉	통과 (0.78ms, 10.3MB)<br>
테스트 13 〉	통과 (1.01ms, 10.3MB)<br>
테스트 14 〉	통과 (1.03ms, 10.3MB)<br>
테스트 15 〉	통과 (0.87ms, 10.2MB)<br>
테스트 16 〉	통과 (0.73ms, 10.2MB)<br>
테스트 17 〉	통과 (0.63ms, 10.3MB)<br>
테스트 18 〉	통과 (0.22ms, 10.2MB)<br>
테스트 19 〉	통과 (0.28ms, 10.3MB)<br>
테스트 20 〉	통과 (0.56ms, 10.2MB)<br>
