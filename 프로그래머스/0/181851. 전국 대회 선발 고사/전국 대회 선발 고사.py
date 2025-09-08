def solution(rank, attendance):
    temp={}
    for i, check in enumerate(attendance):
        if check:
            temp[rank[i]]=i
    tt = sorted(temp)
    
    return 10000 * temp[tt[0]] + 100 * temp[tt[1]] +temp[tt[2]]