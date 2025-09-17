def solution(s):
    answer = []
    r ={}
    for idx,ch in enumerate(s):
        if r.get(ch,-1) ==-1:
            answer.append(-1)
        else: 
            answer.append(idx-r.get(ch))
        r[ch]=idx
    return answer