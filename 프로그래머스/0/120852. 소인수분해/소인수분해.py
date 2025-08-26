def solution(n):
    answer = []
    prime =[True] *(n+1)
    prime[0]=prime[1]=False
    for i in range(2,int(n*0.5)+1):
        if prime[i]:
            for j in range(i*i,n+1,i):
                prime[j]=False
    temp = [i for i ,ch in enumerate(prime) if ch]
    while n >1:
        for i in temp:
            if n%i==0:
                answer.append(i)
                n/=i
                continue
    
    
    return sorted(list(set(answer)))