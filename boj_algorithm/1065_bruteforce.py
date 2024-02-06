N = int(input())
digit = len(str(N))
lst = []
digitLst = []   # 각각의 자릿수를 넣는 리스트
flag = 0

for j in str(N):
    digitLst.append(j)

for j in range(0, len(digitLst)-1):
    lst.append(int(digitLst[j]) - int(digitLst[j+1]))

for j in range(len(lst) - 1):
    if lst[j] == lst[j+1]:
        if flag == 0:
            print("true")
            flag = 1
    else :
        print("false")
# 여기까지 진행하면 특정 수가 "한수"인지 아닌지 판별
