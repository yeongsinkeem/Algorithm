from typing import Any
import sys

class Stack:
    def __init__(self, N : int) -> None:
        self.stk = [None] * N
        self.capacity = N
        self.ptr = 0

    def size(self) -> int:
        return self.ptr

    def push(self, value: Any) -> None:
        self.stk[self.ptr] = value
        self.ptr += 1

    def pop(self) -> Any:
        if self.ptr == 0:
            return -1
        else:
            self.ptr -= 1
            return self.stk[self.ptr]

    def empty(self) -> int:
        return 1 if self.ptr == 0 else 0

    def top(self) -> Any:
        return -1 if self.ptr == 0 else self.stk[self.ptr-1]

N = int(sys.stdin.readline().rstrip())
s = Stack(N)

for _ in range(N):
    order = sys.stdin.readline().rstrip().split()
    if order[0] == "push":
        value = int(order[1])
        s.push(value)
    elif order[0] == "pop":
        print(s.pop())
    elif order[0] == "size":
        print(s.size())
    elif order[0] == "empty":
        print(s.empty())
    elif order[0] == "top":
        print(s.top())


