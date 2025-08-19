def solution(n):
    M = [0,1,2,6,24,120,720,5040,40320,362880,3628800]
    for i,num in enumerate(M,0):
        if num>n:
            return i-1
        elif num==n:
            return i