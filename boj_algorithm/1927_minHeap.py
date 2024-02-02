import heapq
import sys

minheap = []
N = int(sys.stdin.readline())
for i in range(N):
    x = int(sys.stdin.readline())
    if x != 0:
        heapq.heappush(minheap, x)
    elif x == 0:
        if len(minheap) == 0:
            print(0)
        else :
            print(heapq.heappop(minheap))



