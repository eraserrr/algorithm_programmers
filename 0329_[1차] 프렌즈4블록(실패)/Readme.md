```
def isSquare(i, j, board, square):
    # 왼쪽 아래 블록
    left_down = i
    if square[i][j-1] == 2:
        idx = i
        while(idx>-1 and square[idx][j-1]==2):
            idx -= 1
        if idx==-1:
            print('왼쪽아래 블록이 없어')
            return 0,0,0
        left_down = idx
    # 왼쪽 위 블록
    left_up = i-1
    if square[i-1][j-1] == 2:
        idx = left_down - 1
        while (-1 < idx and square[idx][j-1] == 2):
            idx -= 1
            if idx == -1:
                print('왼쪽위 블록이 없어')
                return 0,0,0
        left_up = idx
    # 오른쪽 위 블록
    right_up = i-1
    if square[i-1][j] == 2:
        idx = i
        while (idx > -1 and square[idx][j] == 2):
            idx -= 1
            if idx == -1:
                print('오른쪽 위 블록이 없어')
                return 0,0,0
        right_up = idx

    if board[i][j] == board[left_down][j-1] and board[left_up][j-1]==board[right_up][j] and board[i][j]==board[left_up][j-1]:
        return left_down, left_up, right_up
    print('네모 구성이 다름')
    return 0,0,0


def solution(m, n, board):
    answer = 0
    square = []
    for i in range(m):
        square.append([0] * n)

    while (True):
        print()
        for i in range(len(square)):
            for j in range(len(square[0])):
                print(square[i][j], end=' ')
            print()
        square_exist = False
        for i in range(1, m):
            for j in range(1, n):
                if square[i][j]==2:
                    continue
                left_down, left_up, right_up = isSquare(i, j, board, square)
                # 2*2 가능
                print()
                print(i, j, left_down, left_up, right_up)
                print()
                if left_down > 0:
                    plus = 4
                    if square[left_down][j - 1] == 1:
                        plus -= 2
                    elif square[left_up][j - 1] == 1:
                        plus -= 1
                    answer += plus

                    square[i][j]=1
                    square[left_down][j-1]=1
                    square[left_up][j]=1
                    square[right_up][j-1]=1

                    square_exist = True
                    print('사각형 존재')

        for i in range(0, m):
            for j in range(0, n):
                if square[i][j] == 1:
                    square[i][j] = 2

        if not square_exist:
            break

    return answer

print(solution(2,2,["TT", "TT"]	))
```
square[i][j]의 위쪽 인덱스만 고려해서 실패한듯 ㅠ ㅠ <br>
떨어진 블록을 계산하는걸 다시 해야해서 해

```
def solution(m, n, board):
    # m = 3
    # n = 5
    # board = ["AAAAA","AAAAA","AAAAA"]
    
    answer = 0
    
    # board 회전
    tmp = []
    for i in range(n):
        a = []
        for j in range(m-1,-1,-1,):
            a.append(board[j][i])
        tmp.append(a)

    board = tmp

    while (True):
        tmp = []

        # board 정보를 그대로 tmp에
        for i in range(len(board)):
            tmp.append([0 for _ in board[i]])
        square_exist = False

        # boar의 사각형 정보를 tmp 에 표시
        for i in range(len(board)-1):
            for j in range(len(board[i])-1):
                # 아래 칸에 블록이 없다면
                if len(board[i+1])==0 or j==len(board[i+1])-1:
                    break
                # 사각형 됨
                if board[i][j]==board[i+1][j] and board[i][j+1]==board[i+1][j] and board[i][j]==board[i+1][j+1]:
                    tmp[i][j] = 1
                    tmp[i+1][j] = 1
                    tmp[i][j+1] = 1
                    tmp[i+1][j+1] = 1
                    square_exist = True

        # tmp 의 사각형 정보로 board 의 블록 제거
        for i in range(len(tmp)):
            for j in range(tmp[i].count(1)):
                board[i].pop(tmp[i].index(1))
                answer += 1

        if square_exist==False:
            break

    return answer
```
90점..반례좀 찾아조..

```
def solution(m, n, board):
    answer = 0
    tmp = []
    for i in range(n):
        a = []
        for j in range(m-1,-1,-1,):
            a.append(board[j][i])
        tmp.append(a)

    board = tmp

    while (True):
        tmp = []

        # board 정보를 그대로 tmp에
        for i in range(len(board)):
            tmp.append([0 for _ in board[i]])
        square_exist = False

        # boar의 사각형 정보를 tmp 에 표시
        for i in range(len(board)-1):
            for j in range(len(board[i])-1):
                # board 기준 오른쪽칸이 비어있으면
                if len(board[i + 1]) == 0 or j == len(board[i + 1]) - 1:
                    break
                # 사각형 됨
                if board[i][j]==board[i+1][j] and board[i][j+1]==board[i+1][j] and board[i][j]==board[i+1][j+1]:
                    tmp[i][j] = 1
                    tmp[i+1][j] = 1
                    tmp[i][j+1] = 1
                    tmp[i+1][j+1] = 1
                    square_exist = True

        if square_exist==False:
            break

        # tmp 의 정보로 board 에 지울 블록을 표시(-1)
        for i in range(len(tmp)):
            for _ in range(tmp[i].count(1)):
                board[i][tmp[i].index(1)] = -1
                tmp[i][tmp[i].index(1)] = 0
                answer += 1
        # board 의 사각형 정보 -1로 블록 제거
        for i in range(len(board)):
            for _ in range(board[i].count(-1)):
                board[i].remove(-1)

    return answer
```
index 를 잘못써서 ;; ㅎㅎ일어난 문제였ㅅ다
