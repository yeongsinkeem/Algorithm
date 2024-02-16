def binary_s(arr, target, start, end):  # 리턴값은 mid 또는 None
    while start <= end:
        mid = (start + end) // 2
        if arr[mid] == target:
            return mid
        elif arr[mid] > target:
            end = mid - 1
        else :
            start = mid + 1
    return None

N = int(input())
A = list(map(int, input().split()))
A.sort()

M = int(input())
B = list(map(int, input().split()))
for i in range(M):
    res = binary_s(A, B[i], 0, len(A) - 1)
    if res == None:
        print(0)
    else :
        print(1)
