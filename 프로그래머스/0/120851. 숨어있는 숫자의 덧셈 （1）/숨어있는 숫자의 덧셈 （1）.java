class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for(char c : my_string.toCharArray()) {
            if(49<=c&&c<=57) {
                answer += (int)c-'0';
            }
        }
        return answer;
    }
}