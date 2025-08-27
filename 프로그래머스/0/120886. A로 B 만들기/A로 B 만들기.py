def solution(before, after):
    answer = 0
    temp ={}
    temp2={}
    for ch in before:
        if temp.get(ch):
            temp[ch] +=1
        else:
            temp[ch] =1
    
    for ch in after:
        if temp2.get(ch):
            temp2[ch] +=1
        else:
            temp2[ch] =1
    return int(temp==temp2)