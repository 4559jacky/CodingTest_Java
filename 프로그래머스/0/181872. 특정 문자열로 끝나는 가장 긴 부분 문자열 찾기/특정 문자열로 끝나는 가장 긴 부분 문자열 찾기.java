class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int length = pat.length();
        for(int i=myString.length(); i>=length; i--) {
            if(pat.equals(myString.substring(i-length, i))) {
                answer = myString.substring(0, i);
                break;
            }
        }
        return answer;
    }
}