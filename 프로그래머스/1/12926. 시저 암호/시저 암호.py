def solution(s, n):
    answer = ''
    for ch in s:
        cal= ord(ch)+n
        if ch.islower() and cal >ord('z') :
            answer+=chr(ord('a')+cal - ord('z')-1)
        elif cal >ord('Z') and ch.isupper() :
            answer+=chr(ord('A')+cal - ord('Z')-1)
        else:
            if ch ==' ':
                answer+=' '
            else:
                answer +=chr(cal)
    return answer