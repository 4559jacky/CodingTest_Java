class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        for(int i=my_string.length()-1; i>=0; i--) {
            if(my_string.substring(0,i).equals(is_prefix)) answer = 1;
        }
        return answer;
    }
}