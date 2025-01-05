class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        for(String s : my_strings) {
            s = s.substring(parts[cnt][0], parts[cnt][1]+1);
            sb.append(s);
            cnt++;
        }
        return sb.toString();
    }
}