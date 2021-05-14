```
def solution(enroll, referral, seller, amount):
    answer = []
    relation = {}
    account = {}

    for i,j in zip(enroll, referral):
        relation[i] = j
        account[i] = 0


    for person,money in zip(seller, amount):
        money = money * 100
        while(True):
            notmine = int(money * 0.1)
            mine = money - notmine
            account[person] += mine

            if notmine==0 or relation[person]=='-':
                break

            person = relation[person]
            money = notmine

    for person in enroll:
        answer.append(account[person])


    return answer
```
