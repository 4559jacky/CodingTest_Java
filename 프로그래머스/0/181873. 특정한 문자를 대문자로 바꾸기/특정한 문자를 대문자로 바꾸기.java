class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for(String s : my_string.split("")) {
            if(s.equals(alp)) {
                sb.append(s.toUpperCase());
            } else {
                sb.append(s);
            }
        }
        return sb.toString();
    }
}