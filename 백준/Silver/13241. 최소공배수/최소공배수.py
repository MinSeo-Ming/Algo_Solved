import sys

# repeat = int(sys.stdin.readline())
# for _ in range(repeat):
n,m =map(int, sys.stdin.readline().split())
result = n*m
if n<m:
    n,m=m,n
while m>0:
    n,m = m,n%m
print(result//n)