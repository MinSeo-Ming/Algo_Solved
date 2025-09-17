
def solution(n):
    answer = 0
    per =[True for _ in range(n+1)]
    per[0]=per[1] =False
    for i in range(2,n+1):
        if per[i]:
            answer+=1
            for j in range(i+i,n+1,i):
                per[j]=False
    
    return answer