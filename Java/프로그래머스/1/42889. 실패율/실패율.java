import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = {};
        int total_users = stages.length;
        float failure_rate = 0;
        ArrayList<float[]> failure_rate_array = new ArrayList<>();
        int success_count = 0;
        
        for (int stage = 1; stage <= N; stage++){           // 바깥: 각 스테이지(1~N)    
                success_count = 0;  // 초기화는 여기서!

                for (int i = 0; i < stages.length; i++){ // 안쪽: stages 배열 전체 확인
                    if (stages[i] == stage){
                        success_count += 1;  // 일단 카운트만!
                    }
                }

                // 실패율 계산
                if (total_users == 0) {
                    failure_rate = 0;
                } else {
                    failure_rate = (float) success_count / total_users;
                }
                total_users -= success_count;
                failure_rate_array.add(new float[]{stage, failure_rate});
            }
        
        answer = failure_rate_array.stream()
            .sorted((a, b) -> {
                if (b[1] != a[1]) {
                    return Float.compare(b[1], a[1]);  // 실패율 내림차순
                } else {
                    return Float.compare(a[0], b[0]);  // 스테이지 오름차순
                }
            })
            .mapToInt(arr -> (int) arr[0])  // 스테이지 번호만 추출
            .toArray();  // int[] 배열로 변환
        
        return answer;
    }
}