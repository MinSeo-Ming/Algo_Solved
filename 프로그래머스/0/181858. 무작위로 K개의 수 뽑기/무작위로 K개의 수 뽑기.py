def solution(arr, k):
    answer =[]
    s = set(arr)
    K=0
    for i in arr:
    
            
        if i in s:
            answer.append(i)
            s.remove(i)
    return answer[:k] if len(answer)>=k else answer+[-1]*(k-len(answer))

        