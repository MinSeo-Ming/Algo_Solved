def solution(a, b):
    mon = [0,31,60,91,121,152,182,213,244,274,305,335,366]
    day =["THU","FRI","SAT","SUN","MON","TUE","WED"]
    
    return day[(mon[a-1]+b)%7]