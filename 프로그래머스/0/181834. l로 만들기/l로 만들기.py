def solution(myString):
    answer = list(myString)
    for i, ch in enumerate(myString):
        if ord(ch) <ord('l'):
            answer[i]='l'
    return ''.join(answer)