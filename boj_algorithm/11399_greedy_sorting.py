def countingSort(nums):
    max_num = max(nums)
    counts = [0] * (max_num + 1)

    for num in nums:
        counts[num] += 1

    for c in range(1, len(counts)):
        counts[c] += counts[c-1]

        results = [0] * len(nums)

    for n in range(len(nums) -1, -1, -1):
        results[counts[nums[n]] - 1] = nums[n]
        counts[nums[n]] -= 1

    return results

N = int(input())
lst = list(map(int, input().split()))
#lst.sort()
lst = countingSort(lst)
sum = 0

for i in range(N):
    pointer = 0
    for j in range(i + 1):  # range(i)까지라면 맨 뒤 요소 -1까지만 더하게
        pointer += lst[j]
        #print("더해지는 값은: ", lst[j], end = '')
    sum += pointer
print(sum)
