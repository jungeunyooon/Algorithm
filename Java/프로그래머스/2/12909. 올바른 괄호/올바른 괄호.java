import java.util.Stack;

class Solution {
    boolean solution(String s) {
        Stack<Character> st = new Stack<>();
        boolean answer = true;
        
        for (char c : s.toCharArray()) {
            if (c=='('){
                st.push(c);
            } else {
                if (st.isEmpty()) {
                    answer = false;
                } else {
                    st.pop();
                }
            } 
        }
        if (!st.isEmpty()){
                answer = false;
        }
        return answer;
    }
}
