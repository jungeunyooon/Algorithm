def solution(targets):
    answer = 0
    targets.sort(key = lambda x : x[1])
    current = 0
    for s,e in targets:
        if (current <= s):
            current = e
            answer += 1
    return answer