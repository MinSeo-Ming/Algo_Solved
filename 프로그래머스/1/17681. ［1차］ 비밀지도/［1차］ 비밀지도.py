def solution(n, arr1, arr2):
    answer = []
    for num1,num2 in zip(arr1,arr2):
        answer.append(bin(num1|num2)[2:].zfill(n).replace('1',"#").replace('0',' '))
    return answer