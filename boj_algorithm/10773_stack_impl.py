K = int(input())
lst = []
for i in range(K):
    n = int(input())
    if n != 0:
        lst.append(n)
    else :
        lst.pop()
print(sum(lst))