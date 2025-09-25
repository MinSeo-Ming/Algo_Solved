import sys

num = int(sys.stdin.readline())
sys.stdout.write( f"{1 if (num%4 ==0 and (num%100!=0 or num%400==0)) else 0}")