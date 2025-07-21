def solution(my_string, overwrite_string, s):
    answer = my_string[0:s]
    answer +=overwrite_string
    answer +=my_string[s+len(overwrite_string):]
    return answer