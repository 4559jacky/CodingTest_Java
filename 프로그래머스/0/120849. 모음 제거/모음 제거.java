class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] str = my_string.split("");
        for(String s : str) {
            if(s.equals("a")||
               s.equals("e")||
               s.equals("i")||
               s.equals("o")||
               s.equals("u")) {
                continue;
            }
            answer += s;
        }
        return answer;
    }
}