def solution(my_string):
    
    temp=set()
    result=[]
    [result.append(x) or temp.add(x) for x in my_string if x not in temp]

    return "".join(result )