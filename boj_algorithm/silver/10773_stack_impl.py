import sys
K = int(input())
lst = []
for i in range(K):
    n = int(sys.stdin.readline())
    if n != 0:
        lst.append(n)
    else :
        lst.pop()
print(sum(lst))