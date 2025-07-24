def solution(a, b, c):
    answer = a+b+c
    if a ==b or b==c or a ==c:
        answer *= (a**2 +b**2 +c**2)
        if a ==b and b==c:
            answer*=(a**3+b**3+c**3)
    return answer