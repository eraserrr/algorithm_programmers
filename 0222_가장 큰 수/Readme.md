```
# 1. digit 에서 max를 구한다
# 2. max가 유일한 값인지 확인한다
# 3-1. 유일 -> answer 에 값을 추가
# 3-2. 유일x -> 다음 digit' 에서 max를 구한다 ( 1-3 반복)
#
# 예외 ) digit에서 자릿수가 없는 수가 있을 때

# 33과 3 -> 둘다 똑같
# 34와 3 -> 34가 더 앞에
# 32와 3 -> 3이 더 앞에

def find_max(numbers, digit, answer):
    print(numbers, digit, answer)
    # 1
    max_num = '0'
    for i in range(len(numbers)):
        if len(numbers[i]) < digit:
            if numbers[i][digit-1]>max_num[digit-1]:
                max_num = numbers[i]
        elif numbers[i][digit]>max_num[digit]:
            max_num = numbers[i]

    # 2
    unique = True
    if numbers.count(max_num) > 1:
        unique = False

    # 3-1
    if unique:
        return answer + max_num

    # 3-2
    else :
        tmp = []
        for i in range(len(numbers)):
            if numbers[i][digit]==max_num[digit]:
                tmp.append(numbers[i][digit])
        return find_max(tmp, 1, answer)

numbers = [6,10,2]

numbers = [str(num) for num in numbers]
print(find_max(numbers, 0, ''))
```
