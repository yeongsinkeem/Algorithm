import sys
N = int(sys.stdin.readline())
region = list(map(int, input().split()))
total = int(sys.stdin.readline())

if sum(region) <= total:
    print(max(region))
else :  # 조정이 필요한 상황이라면
    region.sort(reverse=True)
    for i in range(N):
        newlimit = region[i]
        count = 0  # 상한선보다 작은 애들 얼마나 있는지
        for j in range(i):
            if region[j] < newlimit:   # 만약 요소가 상한액보다 작다면
                continue
            else :
                region[j] = newlimit
                count += 1
        if sum(region) <= total:
            newlimit += (total - sum(region)) // count
            print(newlimit)
            break
        else :
            continue
