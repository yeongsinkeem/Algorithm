target = int(input())
n = target // 5 # 5로 나눌 몫
m = target // 3
lst = []

for i in range(n, -1, -1):
    for j in range(m, -1, -1):
        newtarget = 5 * i + 3 * j
        if newtarget == target:
            lst.append((i+j))

if len(lst) == 0:
    print(-1)
else :
    print(min(lst))


