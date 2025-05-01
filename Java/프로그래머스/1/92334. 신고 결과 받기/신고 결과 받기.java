import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        // 1. 사용자 이름 ↔ 인덱스 매핑
        Map<String, Integer> userIndex = new HashMap<>();
        for (int i = 0; i < id_list.length; i++) {
            userIndex.put(id_list[i], i);
        }

        // 2. 중복 신고 제거 & 신고받은 사람 → 신고자 집합
        Map<String, Set<String>> reportedMap = new HashMap<>();
        // report 배열을 Set으로 감싸서 중복 신고를 한 번만 처리
        for (String rep : new HashSet<>(Arrays.asList(report))) {
            String[] parts = rep.split(" ");
            String reporter = parts[0];
            String target   = parts[1];
            reportedMap
                .computeIfAbsent(target, x -> new HashSet<>())
                .add(reporter);
        }

        // 3. 메일 발송 수 집계용 배열 (초기값 0)
        int[] mailCount = new int[id_list.length];

        // 4. 각 신고당한 사용자별 신고자 수가 k 이상인 경우
        //    해당 신고자들에게 메일 1회씩 추가
        for (Map.Entry<String, Set<String>> entry : reportedMap.entrySet()) {
            Set<String> reporters = entry.getValue();
            if (reporters.size() >= k) {
                for (String reporter : reporters) {
                    int idx = userIndex.get(reporter);
                    mailCount[idx]++;
                }
            }
        }

        return mailCount;
    }
}
