import sys
N, M = map(int, sys.stdin.readline().split())
chess = []

for _ in range(N):
    chess.append(list(sys.stdin.readline().strip())) # 행마다 하나의 리스트로

answer = []
# 8 * 8 크기의 체스판 움직이기
for row in range(N - 7):
    for col in range(M - 7):
        sb = 0  # 시작 요소가 검정색
        sw = 0  # 시작 요소가 흰색
        for i in range(row, row + 8):
            for j in range(col, col + 8):
                if ( i + j ) % 2 == 0:  # 1, 3, 5, 7, 9 .. 가 검정색
                    if chess[i][j] == "B":
                        sw += 1
                    else :
                        sb += 1
                else :
                    if chess[i][j] == "B":
                        sb += 1
                    else :
                        sw += 1
        answer.append(sb)
        answer.append(sw)
print(min(answer))

