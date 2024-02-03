import sys
N = int(sys.stdin.readline())
minregion = 0   # 상한선보다 작은 애들의 차액값
#minmin = []
count = 0   # 상한선보다 작은 애들 얼마나 있는지
region = list(map(int, input().split()))
total = int(sys.stdin.readline())

if sum(region) <= total:
    print(max(region))
else :
    avgregion = total // len(region)
    for i in range(N):
        if region[i] < avgregion:
            minregion += avgregion - region[i]
            count += 1
            #minmin.append(region[i])
        else :
            continue
    print(minregion)
    #minmin.append(minregion // (len(region) - count) + avgregion)
    #print(max(minmin))
    print(minregion // (len(region) - count) + avgregion)

