import java.util.*;

class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        String[] str = new String[my_string.length()/m];
        for(int i=0; i<my_string.length()/m; i++) {
            str[i] = my_string.substring(i*m, (i+1)*m);
        }
        for(int i=0; i<my_string.length()/m; i++) {
            sb.append(str[i].charAt(c-1));
        }
        return sb.toString();
    }
}