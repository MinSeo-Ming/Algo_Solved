def solution(arr):
    answer = []
    for i in arr:
        if len(answer)==0:
            answer.append(i)
        else:
            if answer[-1] == i:
                answer.pop()
            else:
                answer.append(i)
    return [-1] if answer==[] else answer