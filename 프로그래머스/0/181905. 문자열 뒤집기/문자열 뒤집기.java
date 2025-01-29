class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String str = my_string.substring(0,s);
        String str_reverse = "";
        for(int i=e; i>=s; i--) {
            str_reverse += my_string.charAt(i);
        }
        answer = my_string.substring(0,s) + str_reverse + my_string.substring(e+1,my_string.length());
        return answer;
    }
}