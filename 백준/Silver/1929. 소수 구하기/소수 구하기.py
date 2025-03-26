import sys

st, n = map(int, sys.stdin.readline().split())

def prime_numbers(start, end):
    arr = [True] * (end + 1)
    arr[0] = arr[1] = False  # 0과 1은 소수 아님

    for i in range(2, int(end ** 0.5) + 1):
        if arr[i]:
            for j in range(i * i, end + 1, i):
                arr[j] = False

    return [i for i in range(start, end + 1) if arr[i]]

result = '\n'.join(str(s) for s in prime_numbers(st, n))
sys.stdout.write(result + '\n')
