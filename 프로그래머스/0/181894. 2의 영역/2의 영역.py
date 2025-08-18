def solution(arr):
    answer = []
    try:
        i= (arr.index(2))
        r = len(arr)- list(reversed(arr)).index(2)
        
        return arr[i:r]
    except:
        return [-1]