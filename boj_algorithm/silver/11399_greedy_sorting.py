N = int(input())
lst = list(map(int, input().split()))
lst.sort()
sum = 0

for i in range(N):
    pointer = 0
    for j in range(i + 1):
        pointer += lst[j]
        #print("더해지는 값은: ", lst[j], end = '')
    sum += pointer
    #print()
print(sum)
