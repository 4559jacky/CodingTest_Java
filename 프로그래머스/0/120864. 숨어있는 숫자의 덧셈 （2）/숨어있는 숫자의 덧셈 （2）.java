import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] numStr = my_string.split("[a-zA-Z]");
        for(String s : numStr) {
            if(s.equals("")) {
                continue;
            }
            answer += Integer.parseInt(s);
        }
        return answer;
    }
}