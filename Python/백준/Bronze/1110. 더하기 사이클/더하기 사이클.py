N = int(input())
original = N 
count = 0

while True:
    a = N // 10  # 십의 자리
    b = N % 10   # 일의 자리
    c = (a + b) % 10  # 각 자리의 합의 오른쪽 숫자
    N = (b * 10) + c  # 새로운 숫자 생성
    count += 1  # 횟수 증가

    if N == original:  # 원래 숫자로 돌아오면 종료
        break

print(count)  # 사이클 길이 출력
