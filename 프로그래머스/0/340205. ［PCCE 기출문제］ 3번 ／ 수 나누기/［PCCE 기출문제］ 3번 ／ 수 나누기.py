number = int(input())

answer = 0

for i in range(0,len(str(number)),2):
    answer += number % 100
    number //= 100

print(answer)