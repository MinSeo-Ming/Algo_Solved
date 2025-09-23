def solution(answers):
    people=[[0 ],[1,2,3,4,5],[2,1,2,3,2,4,2,5],[3,3,1,1,2,2,4,4,5,5]]
    answer=[]
    max_answer=0
    for order in range(1,4):
        p =people[order]
        count=0

        for idx,a in enumerate(answers):
            if a ==p[idx%len(p)]:
                count+=1
        if max_answer==count:
            answer.append(order)
        elif max_answer<count:
            answer =[]
            answer.append(order)
            max_answer =count
    return answer