def solution(picture, k):
    answer = []
    for p in picture:
        st=''
        for ch in p:
            st+=ch*k
        for i in range(k):
            answer.append(st)
    return answer