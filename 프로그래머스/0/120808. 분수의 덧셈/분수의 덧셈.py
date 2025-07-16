def gg(num1,num2):
    temp=0
    if num2> num1:
        temp = num1
        num1 =num2
        num2= temp
    while num2 >0:
        num1,num2 = num2, num1 %num2
    return num1

def solution(numer1, denom1, numer2, denom2):
    num = numer1 * denom2 + numer2 * denom1
    demon =denom1 * denom2
    gc = gg(num,demon)
    num = num/gc
    demon = demon/gc
    print(numer1,denom1,numer2,denom2,num,demon)
    
    answer = [int(num),int(demon)]
    return answer

