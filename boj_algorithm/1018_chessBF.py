def chess(A):
    length = len(A)
    count = 0
    for i in range(length - 1):
        if A[i] == A[i+1]:
            if A[i+1] == "B":
                A[i+1] = "W"
            else:
                A[i+1] = "B"
            count += 1
    return count

N, M = map(int, input().split())
#sum = 0
for i in range(N):
    for j in range(M):


    #lst = list(input())
    #sum += chess(lst)

#print(sum)
