def func(a): # 한수인지 판정하는 함수
    digit = len(str(a))
    lst = []
    digitLst = []  # 각각의 자릿수를 넣는 리스트

    if digit == 1 or digit == 2:
        return True
    else :
        for j in str(a):
            digitLst.append(j)

        for j in range(0, len(digitLst)-1):
            lst.append(int(digitLst[j]) - int(digitLst[j+1]))

        for j in range(len(lst) - 1):
            if lst[j] == lst[j+1]:
                return True
            if lst[0] != lst[len(lst)-1]:
                return False

N = int(input())
count = 0
for i in range(1, N+1):
    if func(i) == True:
        count += 1
print(count)