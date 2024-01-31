import sys
import heapq

N = int(sys.stdin.readline())
max_heap = []

for i in range(N):
    x = int(sys.stdin.readline())
    if x != 0:
        heapq.heappush(max_heap, (-x, x))
    elif len(max_heap) == 0:
        print(0)
    else :
        print(heapq.heappop(max_heap)[1])
