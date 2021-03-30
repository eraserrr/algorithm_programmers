```
def solution(str1, str2):
    answer = 0

    str1 = str1.upper()
    str2 = str2.upper()

    intersection = []
    union = []

    tmp1 = {}
    tmp2 = {}

    for i in range(len(str1)-1):
        if not str1[i].isalpha() or not str1[i+1].isalpha():
            continue
        partial = str1[i] + str1[i+1]
        if partial in tmp1.keys():
            tmp1[partial] += 1
            continue
        tmp1[partial] = 1
    
    for i in range(len(str2)-1):
        if not str2[i].isalpha() or not str2[i+1].isalpha():
            continue
        partial = str2[i] + str2[i+1]
        if partial in tmp2.keys():
            tmp2[partial] += 1
            continue
        tmp2[partial] = 1

    for key in tmp1.keys():
        if key in tmp2.keys():
            if tmp1[key]<tmp2[key]:
                intersection += ([key] * tmp1[key])
                union += ([key] * tmp2[key])
            else:
                intersection += ([key] * tmp2[key])
                union += ([key] * tmp1[key])

    for key in tmp1.keys():
        if key not in intersection:
            union += [key] * tmp1[key]

    for key in tmp2.keys():
        if key not in intersection:
            union += [key] * tmp2[key]


    if len(union)==0:
        return 65536

    return int((len(intersection)/len(union)) * 65536)
```
테스트 1 〉	통과 (0.02ms, 10.2MB)<br>
테스트 2 〉	통과 (0.03ms, 10.3MB)<br>
테스트 3 〉	통과 (0.02ms, 10.3MB)<br>
테스트 4 〉	통과 (3.26ms, 10.3MB)<br>
테스트 5 〉	통과 (0.02ms, 10.3MB)<br>
테스트 6 〉	통과 (0.02ms, 10.3MB)<br>
테스트 7 〉	통과 (0.15ms, 10.2MB)<br>
테스트 8 〉	통과 (0.02ms, 10.3MB)<br>
테스트 9 〉	통과 (0.12ms, 10.2MB)<br>
테스트 10 〉	통과 (0.25ms, 10.3MB)<br>
테스트 11 〉	통과 (0.34ms, 10.3MB)<br>
테스트 12 〉	통과 (0.01ms, 10.2MB)<br>
테스트 13 〉	통과 (0.06ms, 10.3MB)<br>
