def solution(num_list, n):
    for num in num_list:
        if num == n:
            return 1  # Found n, return 1 immediately
    return 0 