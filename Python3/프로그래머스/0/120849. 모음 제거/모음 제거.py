def solution(my_string):
    remove_chars = "aeiou"
    answer = ''.join(filter(lambda x: x not in remove_chars, my_string))
    return answer