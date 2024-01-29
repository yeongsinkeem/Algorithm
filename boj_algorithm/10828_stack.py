from typing import Any

class Stack:
    def __init__(self, N : int) -> None:
        # 스택 초기화
        self.stk = [None] * N
        self.capacity = N
        self.ptr = 0

    def size(self) -> int:
        print(self.ptr)
        return self.ptr

    def push(self, value: Any) -> None:
        self.stk[self.ptr] = value
        self.ptr += 1

    def pop(self) -> Any:
        if self.ptr == 0:
            print("-1")
            return -1
        else:
            self.ptr -= 1
            print(self.stk[self.ptr])
            return self.stk[self.ptr]

    def empty(self) -> bool:
        if self.ptr == 0:
            print("1")
            return True
        else :
            print("0")
            return False

    def top(self) -> Any:
        if self.ptr == 0:
            print("-1")
        else:
            print(self.stk[self.ptr - 1])
            return self.stk[self.ptr - 1]

N = int(input())
s = Stack(N)
for i in range(N):
    order = input().strip()
    if order.startswith("push"):
        value = int(order.split()[1])
        s.push(value)
    elif order == "pop":
        s.pop()
    elif order == "size":
        s.size()
    elif order == "empty":
        s.empty()
    elif order == "top":
        s.top()


