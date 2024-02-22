import sys

def calculate_cost_with_limit(region, limit):   # limit으로 갱신된 값들로 total 계산
    total_cost = 0
    for r in region:
        total_cost += min(r, limit)
    return total_cost

def binary_search(region, total):   #이진탐색
    low, high = 0, max(region)
    while low <= high:
        mid = (low + high) // 2
        cost_with_limit = calculate_cost_with_limit(region, mid)

        if cost_with_limit <= total:
            low = mid + 1
        else:
            high = mid - 1
    return high

def main():
    N = int(sys.stdin.readline())
    region = list(map(int, input().split()))
    total = int(sys.stdin.readline())

    if sum(region) <= total:
        print(max(region))
    else:
        region.sort()

        result = binary_search(region, total)
        print(result)

if __name__ == "__main__":
    main()

