import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char[] be = before.toCharArray();
        char[] af = after.toCharArray();
        Arrays.sort(be);
        Arrays.sort(af);
        int count=0;
        for(int i=0; i<be.length; i++) {
            if(be[i]==af[i]) {
                count++;
            }
        }
        if(be.length==count) answer = 1;
        return answer;
    }
}