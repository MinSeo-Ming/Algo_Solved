def solution(array):
    count=0
    answer =0
    m = max(array)
    li =[0]*(m+1)
    for num in array:
        li[num]+=1

    for i in range(m+1):
        if count <li[i]:
            count = li[i]
            answer = i
        elif count ==li[i]:
            answer=-1
    return answer