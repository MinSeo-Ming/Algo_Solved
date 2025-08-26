def solution(s):
    answer = ''
    dup = set()
    origin = set()
    for ch in s:
        if ch in origin:
            dup.add(ch)
            origin.remove(ch)
        else:
            if ch not in dup:
                origin.add(ch)
        
    return ''.join(sorted(list(origin)))