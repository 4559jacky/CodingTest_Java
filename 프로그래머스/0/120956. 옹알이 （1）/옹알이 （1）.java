class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String[] str = {"aya", "ye", "woo", "ma"};
        for(String bab : babbling) {
            for(int i=0; i<str.length; i++) {
                if(bab.contains(str[i])) {
                    bab = bab.replace(str[i], " ");
                }
            }
            bab = bab.replace(" ", "");
            if(bab.length()==0) {
                answer++;
            }
        }
        return answer;
    }
}