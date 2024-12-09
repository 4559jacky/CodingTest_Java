class Solution {
    public String solution(int age) {
        String answer = "";
        String num = Integer.toString(age);
        for(int i=0; i<num.length(); i++) {
            char c = (char)((int)num.charAt(i)+49);
            answer += c;
        }
        return answer;
    }
}