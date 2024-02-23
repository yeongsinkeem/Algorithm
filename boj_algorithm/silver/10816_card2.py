import sys
from collections import defaultdict

N = int(sys.stdin.readline())
A = list(map(int, sys.stdin.readline().split()))
M = int(sys.stdin.readline())
B = list(map(int, sys.stdin.readline().split()))

A.sort()
Adic = defaultdict(int)

for num in A:
    Adic[num] += 1 # Adic으로 개수 세어주고
result = []
for num in B:
    result.append(Adic[num])

print(*result)


