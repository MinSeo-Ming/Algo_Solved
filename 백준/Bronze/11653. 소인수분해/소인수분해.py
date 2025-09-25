import sys

M = int(sys.stdin.readline())
if M==1:
    print()
else:
    prime=[True for _ in range(M+1)]
    prime[0]=False
    prime[1]=False
    temp=[]
    result =[]
    for i in range(2, M+1):
        if prime[i]:
            temp.append(i)
            for j in range(i+i, M+1, i):
                prime[j] = False
    while M>1:
        for num in temp:
            if M%num==0:
                result.append(num)
                M//=num
                break
    print('\n'.join(map(str, result)))