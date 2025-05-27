from itertools import permutations
def solution(babbling):
    possible =["aya","ye","woo","ma"]
    answer =0
    
    all = {''.join(perm) for r in range(1,len(possible)+1) for perm in permutations(possible,r)}
    
    for ba in babbling:
        if ba in all:
            answer +=1
    return answer