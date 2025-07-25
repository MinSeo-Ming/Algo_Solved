def solution(numLog):
    answer = ""
    cal = {1:"w",-1:"s",10:"d",-10:"a"}

    for i in range(1,len(numLog)):
        answer+=(cal[numLog[i]-numLog[i-1]])
        # answer.append(str())
        
    return answer