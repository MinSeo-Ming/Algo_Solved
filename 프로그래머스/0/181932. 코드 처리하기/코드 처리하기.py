def solution(code):
    mode =0
    li = len(code)
    answer = ''

    
    for i in range(li):
        ch = code[i]
        if ch =='1':
            mode = (mode+1)%2
            continue
        if mode ==0:
            if i%2==0:
                answer +=code[i]
        else:
            if i%2==1:
                answer +=code[i]
    if answer=='': return "EMPTY"
    return answer