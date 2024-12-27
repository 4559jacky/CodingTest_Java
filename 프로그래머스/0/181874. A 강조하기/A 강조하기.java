class Solution {
    public String solution(String myString) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        myString = myString.toLowerCase();
        for(String s : myString.split("")) {
            if(s.equals("a")) {
                sb.append("A");
            } else {
                sb.append(s);
            }
        }
        return sb.toString();
    }
}