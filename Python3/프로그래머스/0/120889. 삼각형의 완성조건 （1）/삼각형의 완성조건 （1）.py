def solution(sides):
    sides.sort(reverse=True)
    if(sides[0]>= sides[1]+sides[2]):
        answer = 2
    else:
        answer = 1
    return answer

