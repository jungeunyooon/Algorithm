def solution(my_string):
    seen = set()
    answer = ''
    for char in my_string:
        if char not in seen:
            seen.add(char)
            answer += char
    return answer
