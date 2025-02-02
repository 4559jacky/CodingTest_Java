class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        String[] s = my_string.split("");
        for(int i=0; i<s.length; i++) {
            for(int j=0; j<indices.length; j++) {
                if(i == indices[j]) {
                    s[i] = "";
                }
            }
        }
        for(int i=0; i<s.length; i++) {
            sb.append(s[i]);
        }

        return sb.toString();
    }
}