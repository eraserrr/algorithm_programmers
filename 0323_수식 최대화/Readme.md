```
from itertools import permutations

def solution(expression):
    idx = 0
    cal = ['-','*','+']
    # 전처리
    i=0
    num_list = []
    op_list = []
    for i in range(len(expression)):
        if expression[i].isdigit() == False:
            if expression[i] == '-':
                op_list.append('-')
            elif expression[i] == '+':
                op_list.append('+')
            elif expression[i] == '*':
                op_list.append('*')
            num_list.append(int(expression[idx:i]))
            idx = i + 1

    num_list.append(int(expression[idx:]))
    max_per = -1
    for permutation in permutations(cal,3):
        tmp_num = [x for x in num_list]
        tmp_op = [x for x in op_list]
        for p in permutation:
            for i in range(len(op_list)):
                if p==op_list[i]:
                    idx = tmp_op.index(p)
                    x = tmp_num.pop(idx)
                    y = tmp_num.pop(idx)
                    z = tmp_op.pop(idx)
                    if z=='-':
                        tmp_num.insert(idx,x-y)
                    if z=='*':
                        tmp_num.insert(idx, x*y)
                    if z=='+':
                        tmp_num.insert(idx,x+y)

        if abs(tmp_num[0])>max_per:
            max_per = abs(tmp_num[0])

    return max_per
```
테스트 1 〉	통과 (0.07ms, 10.5MB)<br>
테스트 2 〉	통과 (0.07ms, 10.4MB)<br>
테스트 3 〉	통과 (0.09ms, 10.4MB)<br>
테스트 4 〉	통과 (0.65ms, 10.4MB)<br>
테스트 5 〉	통과 (0.13ms, 10.4MB)<br>
테스트 6 〉	통과 (0.12ms, 10.6MB)<br>
테스트 7 〉	통과 (0.21ms, 10.3MB)<br>
테스트 8 〉	통과 (0.14ms, 10.4MB)<br>
테스트 9 〉	통과 (0.14ms, 10.3MB)<br>
테스트 10 〉	통과 (0.17ms, 10.6MB)<br>
테스트 11 〉	통과 (0.15ms, 10.5MB)<br>
테스트 12 〉	통과 (0.18ms, 10.4MB)<br>
테스트 13 〉	통과 (0.19ms, 10.4MB)<br>
테스트 14 〉	통과 (0.21ms, 10.4MB)<br>
테스트 15 〉	통과 (0.23ms, 10.4MB)<br>
테스트 16 〉	통과 (0.07ms, 10.4MB)<br>
테스트 17 〉	통과 (0.08ms, 10.4MB)<br>
테스트 18 〉	통과 (0.08ms, 10.5MB)<br>
테스트 19 〉	통과 (0.07ms, 10.4MB)<br>
테스트 20 〉	통과 (0.09ms, 10.5MB)<br>
테스트 21 〉	통과 (0.21ms, 10.4MB)<br>
테스트 22 〉	통과 (0.20ms, 10.4MB)<br>
테스트 23 〉	통과 (0.06ms, 10.4MB)<br>
테스트 24 〉	통과 (0.26ms, 10.3MB)<br>
테스트 25 〉	통과 (0.24ms, 10.3MB)<br>
테스트 26 〉	통과 (0.06ms, 10.6MB)<br>
테스트 27 〉	통과 (0.24ms, 10.5MB)<br>
테스트 28 〉	통과 (0.23ms, 10.4MB)<br>
테스트 29 〉	통과 (0.21ms, 10.5MB)<br>
테스트 30 〉	통과 (0.22ms, 10.4MB)<br>
