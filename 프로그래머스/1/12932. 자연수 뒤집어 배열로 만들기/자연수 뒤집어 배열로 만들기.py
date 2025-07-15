import sys
def solution(num):
    l = []
    while num>0:
        l.append(num%10)
        num = num//10
    return l