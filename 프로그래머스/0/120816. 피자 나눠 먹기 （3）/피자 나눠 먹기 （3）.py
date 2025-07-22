def solution(slice, n):
    answer = n //slice + (1 if n%slice!=0 else 0)
    return answer