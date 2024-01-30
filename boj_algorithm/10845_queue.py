from typing import Any
import sys

class Queue:
    def __init__(self, N: int) -> None:
        # 큐 초기화
        self.queue = [None] * N
        self.capacity = N
        self.ptr = 0
        self.ptr2 = 0 # pop을 위한 ptr

    def push(self, v) -> None:
        self.queue[self.ptr] = v
        self.ptr += 1

    def pop(self) -> int:
        if (self.ptr2) >= (self.ptr):
            return -1
        else:
            self.ptr2 +=1
            return self.queue[self.ptr2 - 1]

    def size(self) -> int:
        if (self.ptr - self.ptr2) <= 0 :
            return 0
        else :
            return self.ptr - self.ptr2

    def empty(self) -> int:
        if self.size() <= 0:
            return 1
        else:
            return 0

    def front(self) -> int:
        if self.empty() == 0:    # 비어있지 않다면
            return self.queue[self.ptr2]
        else:
            return -1

    def back(self) -> int:
        if self.empty() == 0:
            return self.queue[self.ptr-1]
        else:
            return -1

N = int(sys.stdin.readline().rstrip())
q = Queue(N)

for i in range(N):
    order = sys.stdin.readline().rstrip().split()
    if order[0] == "push":
        value = order[1]
        q.push(value)
    elif order[0] == "pop":
        print(q.pop())
    elif order[0] == "size":
        print(q.size())
    elif order[0] == "empty":
        print(q.empty())
    elif order[0] == "front":
        print(q.front())
    elif order[0] == "back":
        print(q.back())


