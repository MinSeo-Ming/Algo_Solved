def solution(num_list):
    s=1
    su =sum(num_list)**2
    for i in num_list:
        s *=i
    return 0 if s>su else 1