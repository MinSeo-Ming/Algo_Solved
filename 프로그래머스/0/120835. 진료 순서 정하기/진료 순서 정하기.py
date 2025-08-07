def solution(emergency):
    li = emergency.copy()
    li.sort(reverse=True)
    dic = {}
    answer=[]
    for i,num in enumerate(li):
        dic[num]=i
    print(dic)
    for num in emergency:
        answer.append(dic.get(num)+1)
    return answer