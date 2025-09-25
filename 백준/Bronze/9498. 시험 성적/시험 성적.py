import sys

x= int(sys.stdin.readline())
sys.stdout.write('A' if 90 <= x <= 100 else
    'B' if 80 <= x <= 89 else
    'C' if 70 <= x <= 79 else
    'D' if 60 <= x <= 69 else
    'F')