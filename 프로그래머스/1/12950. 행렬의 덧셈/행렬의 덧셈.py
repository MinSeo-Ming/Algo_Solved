def solution(arr1, arr2):
    answer = [[0 for _ in range(len(arr1[0]))] for _ in range(len(arr1))]
    for row,(ar1,ar2) in enumerate(zip(arr1,arr2)):
        for col, (n1,n2) in enumerate(zip(ar1,ar2)):
            answer[row][col] =n1 +n2
            
    
    return answer