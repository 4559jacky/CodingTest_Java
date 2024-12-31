class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        StringBuilder sb = new StringBuilder(my_string);
        for(int i=0; i<my_string.length(); i++) {
            if(sb.substring(i).toString().equals(is_suffix)) {
                answer = 1;
            }
        }
        return answer;
    }
}