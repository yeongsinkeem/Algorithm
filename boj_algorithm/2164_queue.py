from collections import deque
from sys import stdin
mydeque = deque()

N = int(stdin.readline())

for i in range(N):
    mydeque.append(i+1)

while (len(mydeque) != 1):
    mydeque.popleft()
    k = mydeque.popleft()
    mydeque.append(k)

print(mydeque.pop())
