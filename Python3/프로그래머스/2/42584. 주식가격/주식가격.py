def solution(prices):
    n = len(prices)
    answer = [0] * n
    stack = []
    
    for i, price in enumerate(prices):
        # 현재 가격이 스택에 쌓인 가격보다 작다면, 떨어진 시점을 찾아내기
        while stack and prices[stack[-1]] > price:
            j = stack.pop()
            answer[j] = i - j
        stack.append(i)
    
    # 남아있는 인덱스는 가격이 떨어지지 않은 경우
    while stack:
        j = stack.pop()
        answer[j] = n - 1 - j
        
    return answer
