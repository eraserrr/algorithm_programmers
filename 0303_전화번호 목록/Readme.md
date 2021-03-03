```
def solution(phone_book):
    for number in phone_book:
        count = 0
        for st in phone_book:
            if st.find(number)==0:
                count += 1
                if count > 1:
                    return False
    return True
```
정확성  테스트<br>
테스트 1 〉	통과 (0.01ms, 10.2MB)<br>
테스트 2 〉	통과 (0.01ms, 10.2MB)<br>
테스트 3 〉	통과 (0.00ms, 10.2MB)<br>
테스트 4 〉	통과 (0.00ms, 10.2MB)<br>
테스트 5 〉	통과 (0.01ms, 10.2MB)<br>
테스트 6 〉	통과 (0.01ms, 10.2MB)<br>
테스트 7 〉	통과 (0.01ms, 10.2MB)<br>
테스트 8 〉	통과 (0.01ms, 10.3MB)<br>
테스트 9 〉	통과 (0.00ms, 10.2MB)<br>
테스트 10 〉	통과 (0.00ms, 10.3MB)<br>
테스트 11 〉	통과 (0.01ms, 10.2MB)<br>
효율성  테스트<br>
테스트 1 〉	통과 (1.24ms, 10.9MB)<br>
테스트 2 〉	통과 (1.14ms, 10.9MB)<br>
