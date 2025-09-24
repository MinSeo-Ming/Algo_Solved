def solution(s):
    x =s[0]
    x_cnt =0
    x_n_cnt =0
    answer = 0
    st =0
    for idx,ch in enumerate(s):
        if x == ch:
            x_cnt+=1
        else:
            x_n_cnt+=1
        if x_cnt ==x_n_cnt:

            x_cnt=0
            x_n_cnt=0
            if (idx+1)!= len(s):
                x =s[idx+1]
                st=idx+1
            answer+=1
    if x_cnt!=x_n_cnt:
        answer+=1

    return answer