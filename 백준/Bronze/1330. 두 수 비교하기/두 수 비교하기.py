import sys
x,y= map(int,sys.stdin.readline().split())
sys.stdout.write('<' if x<y else
    '>' if x>y else
    '==' )