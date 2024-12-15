class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        for(String[] s : db) {
            if(id_pw[0].equals(s[0])&&id_pw[1].equals(s[1])) {
                answer = "login";
            } else {
                if(!(id_pw[0].equals(s[0]))&&!(id_pw[1].equals(s[1]))) {
                    answer = "fail";
                } else if(id_pw[0].equals(s[0])&&!(id_pw[1].equals(s[1]))) {
                    answer = "wrong pw";
                }
            }
        }
        return answer;
    }
}