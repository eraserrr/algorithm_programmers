파이썬에서 문자열 정렬시 대소문자 구별됨 
sorted(['a','A']) => ['A','a']

딕셔너리 정렬
sorted(d) => 키를 기준으로 오름차순 정렬된 키 리스트 반환
sorted(d, key=lambda x:d[x]) => value를 기준으로 오름차순 정렬된 키 리스트 반환


```
def solution(files):
    dic = {}
    for file in files:
        idx_num = -1
        idx_tail = -1
        for i in range(len(file)):
            if file[i].isdigit():
                idx_num = i
                break
        for i in range(idx_num+1, len(file)):
            if file[i].isdigit()==False:
                idx_tail = i
                break
        if idx_tail == -1:
            dic[file] = [file[:idx_num].lower(), int(file[idx_num:])]
        else:
            dic[file] = [file[:idx_num].lower(), int(file[idx_num:idx_tail])]

    answer = sorted(dic, key=lambda x: (dic[x][0],dic[x][1]))


    return answer
```
테스트 1 〉	통과 (0.04ms, 10.4MB)<br>
테스트 2 〉	통과 (0.04ms, 10.5MB)<br>
테스트 3 〉	통과 (2.70ms, 10.8MB)<br>
테스트 4 〉	통과 (2.91ms, 10.5MB)<br>
테스트 5 〉	통과 (2.81ms, 10.7MB)<br>
테스트 6 〉	통과 (2.83ms, 10.8MB)<br>
테스트 7 〉	통과 (2.59ms, 10.7MB)<br>
테스트 8 〉	통과 (2.39ms, 10.6MB)<br>
테스트 9 〉	통과 (2.46ms, 10.7MB)<br>
테스트 10 〉	통과 (2.69ms, 10.7MB)<br>
테스트 11 〉	통과 (2.65ms, 10.7MB)<br>
테스트 12 〉	통과 (2.81ms, 10.8MB)<br>
테스트 13 〉	통과 (2.25ms, 10.8MB)<br>
테스트 14 〉	통과 (2.71ms, 10.7MB)<br>
테스트 15 〉	통과 (2.70ms, 10.6MB)<br>
테스트 16 〉	통과 (2.75ms, 10.6MB)<br>
테스트 17 〉	통과 (2.34ms, 10.7MB)<br>
테스트 18 〉	통과 (2.12ms, 10.7MB)<br>
테스트 19 〉	통과 (2.65ms, 10.8MB)<br>
테스트 20 〉	통과 (2.66ms, 10.8MB)<br>
