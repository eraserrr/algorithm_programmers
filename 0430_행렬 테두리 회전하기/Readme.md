```
def solution(rows, columns, queries):
    answer = []
    board = []
    for i in range(rows):
        x = []
        for j in range(columns):
            x.append((i*columns)+(j+1))
        board.append(x)

    for querie in queries:
        min_num = []
        y1,x1,y2,x2 = [x-1 for x in querie]

        b = board[y1][x2]
        for i in range(x2, x1,-1):
            min_num.append(board[y1][i-1])
            board[y1][i] = board[y1][i-1]

        c = board[y2][x1]
        for i in range(x1, x2):
            min_num.append(board[y2][i+1])
            board[y2][i] = board[y2][i+1]

    

        for i in range(y1,y2-1):
            min_num.append(board[i+1][x1])
            board[i][x1] = board[i+1][x1]

        board[y2 - 1][x1] = c
        for i in range(y2, y1, -1):
            min_num.append(board[i-1][x2])
            board[i][x2] = board[i-1][x2]
        board[y1+1][x2] = b

        min_num.append(b)
        min_num.append(c)
        answer.append(min(min_num))

    return answer
```
테스트 1 〉	통과 (0.04ms, 10.2MB)<br>
테스트 2 〉	통과 (0.04ms, 10.3MB)<br>
테스트 3 〉	통과 (163.40ms, 11.7MB)<br>
테스트 4 〉	통과 (88.95ms, 11.2MB)<br>
테스트 5 〉	통과 (122.41ms, 11.5MB)<br>
테스트 6 〉	통과 (215.65ms, 12MB)<br>
테스트 7 〉	통과 (288.23ms, 12MB)<br>
테스트 8 〉	통과 (88.47ms, 11.5MB)<br>
테스트 9 〉	통과 (130.87ms, 11.8MB)<br>
테스트 10 〉	통과 (162.16ms, 11.5MB)<br>
테스트 11 〉	통과 (101.01ms, 11.5MB)<br>
