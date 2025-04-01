def solution(answers):
    # 사람으로 돌려가며 비교
        # 문제랑 정답이랑 비교한다 
        # 문제 반복해서 찍으니 
        # 길이 만큼만 반복해서 한다.
        #맞을 경우 +1
    # 최고값과 비교하여 같으면 인덱스 추가
    # 높으면 전체다 지우고 현재만 추가
    # 낮으면 스킵
    answer = []
    people =[[1, 2, 3, 4, 5],[2, 1, 2, 3, 2, 4, 2, 5],[3, 3, 1, 1, 2, 2, 4, 4, 5, 5]]
    MAX=-1
    order =0
    for person in (people):
        le=len(person)
        sum=0
        order +=1
        for i in range(len(answers)):
            idx = i%le
            if person[idx] == answers[i]:
                sum+=1
        
        if(MAX<sum):
            MAX=sum
            answer.clear()
            answer.append(order)
        elif(MAX==sum):
            answer.append(order)
    return answer