class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String num = ""+k;
        for(int x=i; x<=j; x++) {
            String str = ""+x;
            String[] sArr = str.split("");
            for(String s : sArr) {
                if(s.equals(num)) {
                    answer++;
                }
            }
        }
        return answer;
    }
}