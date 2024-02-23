import sys
import bisect
from sys import stdin
from collections import deque

N = int(stdin.readline())
A = list(map(int, sys.stdin.readline().split()))
M = int(stdin.readline())
B = list(map(int, sys.stdin.readline().split()))   # 탐색해야 하는 카드

def radix_sort(nums):
    buckets = [deque() for _ in range(10)]

    max_val = max(nums)
    Q = deque(nums)
    cur_ten = 1

    while max_val >= cur_ten:
        while Q:
            num = Q.popleft()
            buckets[(num // cur_ten) % 10].append(num)

        for bucket in buckets:
            while bucket:
                Q.append(bucket.popleft())

        cur_ten += 10

    return list(Q)

A = radix_sort(A)    # 상근이가 가지고 있는 카드
Adic = {}

for num in B:
    count = 0
    index = bisect.bisect_left(A, num)
    while index < len(A) and A[index] == num:
        count += 1
        index += 1
    Adic[num] = count

for num in Adic:
    print(Adic[num], end = " ")
#print(Adic)


