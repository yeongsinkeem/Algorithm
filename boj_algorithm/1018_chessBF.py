import sys
N, M = map(int, sys.stdin.readline().split())
chess = []

for _ in range(N):
    chess.append(list(sys.stdin.readline().strip())) # 행마다 하나의 리스트로

answer = []
# 8 * 8 크기의 체스판 움직이기
for row in range(N - 7):
    for col in range(M - 7):
        startB = 0  # 0, 2, 4, 6이 검정색
        startW = 0 # 0, 2, 4, 6이 흰색
        for i in range(row, row + 8):
            for j in range(col, col + 8):
                if ( i + j ) % 2 == 0:
                    if chess[i][j] == "B":
                        startW += 1
                    else :
                        startB += 1
                else :
                    if chess[i][j] == "B":
                        startB += 1
                    else :
                        startW += 1
        answer.append(startB)
        answer.append(startW)
#print("answer 값은", answer)
print(min(answer))

