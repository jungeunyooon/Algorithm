a = int(input())
answer = 0
if ((a % 4 == 0 and a % 100 != 0) or a % 400 == 0): 
    answer = 1
print(answer)
