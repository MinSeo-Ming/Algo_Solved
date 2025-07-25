def solution(n, control):

    for ch in list(control):
        if ch=='w': n+=1   
        elif ch =='s':n -=1 
        elif ch =='d':n +=10   
        else: n-=10
    return n