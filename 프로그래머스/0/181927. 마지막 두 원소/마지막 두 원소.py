def solution(num_list):
    answer = num_list
    answer.append(num_list[-1] -num_list[-2] if num_list[-1] >num_list[-2] else 2*num_list[-1]  )
    return answer