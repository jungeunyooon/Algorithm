import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> answers = new ArrayList<>();
        
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                answers.add(numbers[i] + numbers[j]);
            }
        }
        
        // ArrayList → int[] (스트림)
        return answers.stream()
                      .sorted()
                      .distinct()
                      .mapToInt(Integer::intValue)
                      .toArray();
    }
}