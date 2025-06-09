import math

def solution(numer1, denom1, numer2, denom2):
    up = numer1 * denom2 + numer2 * denom1
    down = denom1 * denom2
    gcb = math.gcd(up, down)  
    
    answer = [0,0] 
    answer[0] = up/gcb
    answer[1] = down/gcb
    return answer