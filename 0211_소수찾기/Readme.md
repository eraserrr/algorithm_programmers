```
from math import sqrt
from itertools import permutations

def find_prime(n):
    if n==1 or n==0:
        return False
    for i in range(2, int(sqrt(n)) + 1):
        if n % i == 0:
            return False
    return True

def solution(numbers):
    answer = 0
    numbers = [n for n in numbers]

    dupl = {}
    for i in range(1,len(numbers)+1):
        for j in permutations(numbers,i):
            number = int(''.join(j))
            if find_prime(number):
                if number in dupl.keys():
                    continue
                answer += 1
                dupl[number] = 1
                print(number)
    
    
    return answer
```
테스트 1 〉	통과 (0.11ms, 10.3MB)<br>
테스트 2 〉	통과 (2.89ms, 10.4MB)<br>
테스트 3 〉	통과 (0.04ms, 10.3MB)<br>
테스트 4 〉	통과 (2.51ms, 10.3MB)<br>
테스트 5 〉	통과 (12.14ms, 10.4MB)<br>
테스트 6 〉	통과 (0.04ms, 10.4MB)<br>
테스트 7 〉	통과 (0.15ms, 10.4MB)<br>
테스트 8 〉	통과 (11.58ms, 10.3MB)<br>
테스트 9 〉	통과 (0.06ms, 10.4MB)<br>
테스트 10 〉	통과 (6.78ms, 10.3MB)<br>
테스트 11 〉	통과 (1.02ms, 10.4MB)<br>
테스트 12 〉	통과 (0.46ms, 10.4MB)<br>
