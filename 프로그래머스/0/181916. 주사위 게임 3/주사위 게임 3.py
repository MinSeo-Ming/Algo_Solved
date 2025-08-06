
from collections import Counter

def solution(a, b, c, d):
    answer =0
    num_li =[a,b,c,d]
    count = Counter(num_li)
    most_common = count.most_common()

    if len(count)==1:
        answer = 1111*a
    elif len(count)==2:
        if most_common[0][1] ==3:
            answer = (10 *most_common[0][0] + most_common[1][0]) **2
        else:
            answer = (most_common[0][0] + most_common[1][0]) * abs(most_common[0][0] - most_common[1][0])
    elif len(count)==3: 
        answer = (most_common[2][0] * most_common[1][0])
    else:
        answer = min(num_li)
    return answer