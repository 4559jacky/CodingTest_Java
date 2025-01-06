class Solution {
    public String solution(String myString) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        char[] charArr = myString.toCharArray();
        for(char c : charArr) {
            if(c<'l') sb.append("l");
            else sb.append(String.valueOf(c));
        }
        return sb.toString();
    }
}