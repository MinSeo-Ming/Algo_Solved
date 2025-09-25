import sys

M = int(sys.stdin.readline())
N = int(sys.stdin.readline())
n = min(M, N)
m = max(M, N)
prime=[True for _ in range(10001)]
prime[0]=False
prime[1]=False
s=0
mi = sys.maxsize
for i in range(2, 10001):
    if prime[i]:
        if i>=n and i<=m:
            mi = min(mi,i)
            s +=i
        for j in range(i+i, 10001, i):
            prime[j] = False
if s ==0:
    sys.stdout.write(str(-1))
else:
    sys.stdout.write(str(s)+"\n")
    sys.stdout.write(str(mi))