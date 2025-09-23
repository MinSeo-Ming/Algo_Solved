def solution(nums):
    n = len(nums)//2
    s = set(nums)
    if len(s)>n:
        return n
    else:
        return len(s)