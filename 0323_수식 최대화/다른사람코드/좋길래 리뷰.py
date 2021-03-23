import re
from itertools import permutations

def solution(expression):
    #1
    
    # 문자열에서 수식 빼내는 거. 이렇게 함으로써 중복 걸러내고 조합 돌릴 수 있음
    op = [x for x in ['*','+','-'] if x in expression]
    op = [list(y) for y in permutations(op)]
    # "100-200*300-500+20" ----> ['100', '-', '200', '*', '300', '-', '500', '+', '20']
    # 이거 뭔지 모르겠지만 찾아보기 귀찮아/..
    ex = re.split(r'(\D)',expression)

    #2
    a = []
    # 조합마다
    for x in op:
        # 이렇게 하면 간단하게 얕은 복사됨(난 바보야ㅠㅠ)
        _ex = ex[:]
   
        for y in x:
            # 탐색하려는 연산자가 _ex 에 존재하지 않을때까지
            while y in _ex:
                tmp = _ex.index(y)
                # eval("1+2") => 3. 
                # 연산자의 왼쪽 숫자에 연산값을 넣음
                _ex[tmp-1] = str(eval(_ex[tmp-1]+_ex[tmp]+_ex[tmp+1]))
                # 연산된 식 나머지만 다시 _ex에 저장
                _ex = _ex[:tmp]+_ex[tmp+2:]
        a.append(_ex[-1])

    #3
    # 이렇게하면 더 깔끔하네!
    return max(abs(int(x)) for x in a)
