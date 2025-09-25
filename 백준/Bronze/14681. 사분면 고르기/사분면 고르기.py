import sys

x= int(sys.stdin.readline())
y= int(sys.stdin.readline())
if x*y>0:
    if x<0:
        sys.stdout.write(f"{3}")
    else:
        sys.stdout.write(f"{1}")
else:
    if y<0:
        sys.stdout.write(f"{4}")
    else:
        sys.stdout.write(f"{2}")