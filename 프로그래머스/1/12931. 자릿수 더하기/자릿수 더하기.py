def solution(n):
    answer = 0
    while n>0:
        answer +=int(n%10)
        n=int(n/10)

    return answer