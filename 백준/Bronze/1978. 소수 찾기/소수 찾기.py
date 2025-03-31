# input() 사용 버전
n = int(input())
nums = list(map(int, input().split()))

max_num = max(nums) + 1  # 입력 수 중 가장 큰 수까지 소수 판별해야 함
prime = [True] * (max_num)
prime[0] = prime[1] = False

for i in range(2, int(max_num ** 0.5) + 1):
    if prime[i]:
        for j in range(i * i, max_num, i):
            prime[j] = False

result = sum(prime[x] for x in nums)
print(result)
