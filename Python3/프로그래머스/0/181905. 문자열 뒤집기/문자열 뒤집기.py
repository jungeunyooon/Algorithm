def solution(my_string, s, e):
    # s부터 e까지 뒤집기
    reverse_string = my_string[s:e+1][::-1]
    # 앞부분 + 뒤집은 부분 + 뒷부분 합치기
    answer = my_string[:s] + reverse_string + my_string[e+1:]
    return answer
