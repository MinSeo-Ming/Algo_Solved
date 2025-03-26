import sys

num = int(sys.stdin.readline())
people=[]

for i in range(num):
    age, name = sys.stdin.readline().split()
    age =int(age)
    people.append((i,age,name))
people.sort(key=lambda x: (x[1], x[0]))
s =''
for person in (people):
    s+= f"{person[1]} {person[2]}\n"

sys.stdout.write(s)