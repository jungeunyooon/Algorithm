import sys

T = int(sys.stdin.readline().strip())

# 결과를 저장할 리스트
result = []

for _ in range(T):
    a, b = map(int, sys.stdin.readline().split())
    result.append(str(a + b))  # 문자열로 변환하여 저장 (출력 최적화)

# 한번에 출력
sys.stdout.write("\n".join(result) + "\n")
