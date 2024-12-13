import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] str = my_string.split(" ");
        int sum = 0;
        for(String s : str) {
            if(!(s.equals("+")||s.equals("-"))) {
                sum += Integer.parseInt(s);
            }
        }
        for(int i=0; i<str.length-1; i++) {
            if(str[i].equals("-")) {
                sum -= 2*(Integer.parseInt(str[i+1]));
            }
        }
        return sum;
    }
}