
''' N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
    첫째 줄에 수의 개수 N(1 ≤ N ≤ 10,000,000)이 주어진다.
    둘째 줄부터 N개의 줄에는 수가 주어진다. 이 수는 10,000보다 작거나 같은 자연수이다.'''
import sys

N = int(input())
count = [0] * 10001

for i in range(N):
    input_num = int(sys.stdin.readline())   # 한 줄씩 입력받기
    count[input_num] += 1

for i in range(len(count)):
    for j in range(count[i]):
        print(i)