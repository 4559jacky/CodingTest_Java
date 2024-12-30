class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        int count = 0;
        for(String s : strArr) {
            answer[count++] = s.toLowerCase();
        }
        for(int i=0; i<answer.length; i++) {
            if(i%2!=0) {
                answer[i] = answer[i].toUpperCase();
            }
        }
        return answer;
    }
}