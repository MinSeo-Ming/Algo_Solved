def solution(n):
    m = 6
    t =n
    if m >n :
        n,m =m,n
    while m>0:
        n,m =m, n%m
    
    return int(t/ n)