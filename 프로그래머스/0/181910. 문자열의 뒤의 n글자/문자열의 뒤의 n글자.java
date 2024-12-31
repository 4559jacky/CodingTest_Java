class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int num = my_string.length() - n;
        return my_string.substring(num);
    }
}