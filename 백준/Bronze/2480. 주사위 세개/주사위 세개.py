import sys
a,b,c= (map(int,sys.stdin.readline().split()))
if a==b==c :
    sys.stdout.write(f"{10000+a*1000}")
elif a==b or a==c:
    sys.stdout.write(f"{1000+a*100}")
elif b==c:
    sys.stdout.write(f"{1000+b*100}")
else:
    m = max(a,b,c)
    sys.stdout.write(f"{m*100}")