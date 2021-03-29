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
