def solution(cards1, cards2, goal):
    answer = '' 
    for word in goal:
        if (word) in cards1:
            if cards1.index(word)!=0:
                return "No"
            else:
                cards1.remove(word)
                # goal.remove(word)
        elif  (word) in cards2:
            if cards2.index(word)!=0:
                return "No"
            else:
                cards2.remove(word)
                # goal.remove(word)
        else:
            return "No"
    
#     if len(goal)>0:
#         return "No"
            
    return "Yes"