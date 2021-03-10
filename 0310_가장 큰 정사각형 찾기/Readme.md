```
def solution(board):
    is_square = [[0]*len(board[0]) for _ in range(len(board))]
    max_square = -1
    for i in range(1,len(board)):
        for j in range(1,len(board[0])):
            if board[i][j] and board[i][j-1] and board[i-1][j] and board[i-1][j-1]:
                is_square[i][j] = min(is_square[i-1][j-1],is_square[i-1][j],is_square[i][j-1]) + 1
                if is_square[i][j]>max_square:
                    max_square = is_square[i][j]
    
    if max_square ==-1:
        for i in range(len(board)):
            if 1 in board[i]:
                return 1
        return 0
    return (max_square+1)**2
```
정확성  테스트<br>
테스트 1 〉	통과 (0.01ms, 10.2MB)<br>
테스트 2 〉	통과 (0.03ms, 10.2MB)<br>
테스트 3 〉	통과 (0.05ms, 10.1MB)<br>
테스트 4 〉	통과 (0.09ms, 10.2MB)<br>
테스트 5 〉	통과 (0.09ms, 10.1MB)<br>
테스트 6 〉	통과 (0.01ms, 10.2MB)<br>
테스트 7 〉	통과 (0.02ms, 10.2MB)<br>
테스트 8 〉	통과 (0.02ms, 10.3MB)<br>
테스트 9 〉	통과 (0.03ms, 10.2MB)<br>
테스트 10 〉	통과 (0.07ms, 10.2MB)<br>
테스트 11 〉	통과 (0.03ms, 10.3MB)<br>
테스트 12 〉	통과 (0.03ms, 10.2MB)<br>
테스트 13 〉	통과 (0.02ms, 10.3MB)<br>
테스트 14 〉	통과 (0.03ms, 10.2MB)<br>
테스트 15 〉	통과 (0.05ms, 10.1MB)<br>
테스트 16 〉	통과 (0.07ms, 10.2MB)<br>
테스트 17 〉	통과 (0.08ms, 10.1MB)<br>
테스트 18 〉	통과 (1.83ms, 10.2MB)<br>
테스트 19 〉	통과 (1.73ms, 10.3MB)<br>
효율성  테스트<br>
테스트 1 〉	통과 (626.46ms, 39MB)<br>
테스트 2 〉	통과 (653.37ms, 38.3MB)<br>
테스트 3 〉	통과 (659.29ms, 38.4MB)<br>
