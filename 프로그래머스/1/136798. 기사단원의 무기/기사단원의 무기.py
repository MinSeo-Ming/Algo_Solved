def solution(number, limit, power):
    answer=0
    
    for i in range(1,number+1):
        temp=0
        end = int(i **0.5)+1
        for j in range(1,end):
            
            if i %j==0:
                if i//j ==j:
                    temp+=1
                else:
                    temp+=2
        # print(i,temp)
        if temp> limit:
            
            answer+=power
        else:
            answer+=temp
        
    return answer

