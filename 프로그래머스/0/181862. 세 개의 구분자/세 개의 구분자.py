def solution(myStr):
    answer = []
    rem=['a','b','c']
    for i in rem:
        myStr=myStr.replace(i,' ')
    return [x for x in myStr.split(' ') if x!=''] if myStr.strip() != '' else ["EMPTY"]