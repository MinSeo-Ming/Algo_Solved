from queue import PriorityQueue

def solution(k, score):
    answer=[]
    qu=[]
    for sc in score:
        if len(qu) == k and  min(qu) < sc:   
            qu.remove(min(qu))
        if len(qu)<k:
            qu.append(sc)
        answer.append(min(qu))
    
    return answer