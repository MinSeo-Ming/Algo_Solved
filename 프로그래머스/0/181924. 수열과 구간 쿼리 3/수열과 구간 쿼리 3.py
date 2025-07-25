def solution(arr, queries):
    for a in queries:
        arr[a[0]],arr[a[1]] = arr[a[1]],arr[a[0]]
    return arr