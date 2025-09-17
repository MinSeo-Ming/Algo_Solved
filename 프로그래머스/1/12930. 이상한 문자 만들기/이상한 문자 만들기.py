def solution(s):
    answer = ''
    odd = True
    for ch in list(s):
        if ch ==' ':
            answer+=' '
            odd =True
            continue
        else:
            if odd:
                odd = False
                answer +=ch.upper()
            else:
                odd =True
                answer +=ch.lower()

    return answer