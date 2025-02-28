n = int(input().strip())  # 사용자 입력 받기
answer = 1  # 곱셈을 해야 하므로 1로 초기화

for i in range(1, n + 1):  # 1부터 n까지 반복
    answer *= i  

print(answer)  # 팩토리얼 값 출력
