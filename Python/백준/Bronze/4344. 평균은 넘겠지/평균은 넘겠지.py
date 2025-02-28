import sys

# 입력 개수 받기
C = int(sys.stdin.readline().strip())

# 각 테스트 케이스 처리
for _ in range(C):
    data = list(map(int, sys.stdin.readline().split()))
    N = data[0]  # 학생 수
    scores = data[1:]  # 점수 리스트
    
    avg_score = sum(scores) / N  # 평균 점수 계산
    above_avg_count = sum(1 for score in scores if score > avg_score)  # 평균 초과 학생 수 계산
    
    percentage = (above_avg_count / N) * 100  # 비율 계산
    
    print(f"{percentage:.3f}%")  # 소수점 셋째 자리까지 출력
