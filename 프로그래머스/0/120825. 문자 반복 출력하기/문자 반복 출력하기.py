def solution(my_string, n):
    answer = ''
    li = list(my_string)
    for ch in li:
        answer+=ch*n
    return answer