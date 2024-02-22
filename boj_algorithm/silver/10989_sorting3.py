
import sys

N = int(input())
count = [0] * 10001

for i in range(N):
    input_num = int(sys.stdin.readline())   # 한 줄씩 입력받기
    count[input_num] += 1

for i in range(len(count)):
    for j in range(count[i]):
        print(i)