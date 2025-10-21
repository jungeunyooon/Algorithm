import java.util.Arrays;

class Solution {
    public int[] solution(int[] answers) {
        int[] scores = new int[3];
        int[][] patterns = {
            {1,2,3,4,5}, 
            {2,1,2,3,2,4,2,5}, 
            {3,3,1,1,2,2,4,4,5,5}
        };
        
        for (int i=0; i<3; i++){
             for (int j=0; j<answers.length; j++){
                 if(patterns[i][j % patterns[i].length] == answers[j]){
                     scores[i]++;
                 }
            }   
        }
        
        int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));

        int count = 0;
        if (scores[0] == maxScore) count++;
        if (scores[1] == maxScore) count++;
        if (scores[2] == maxScore) count++;

        int[] answer = new int[count];

        int index = 0;
        if (scores[0] == maxScore) answer[index++] = 1;
        if (scores[1] == maxScore) answer[index++] = 2;
        if (scores[2] == maxScore) answer[index++] = 3;

        return answer;
    }
}