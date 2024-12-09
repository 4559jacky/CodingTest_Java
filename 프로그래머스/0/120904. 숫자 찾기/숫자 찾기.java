class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String n = "" + num;
        String c = "" + k;
        int[] numArr = new int[n.length()];
        for(int i=0; i<n.length(); i++) {
            String nn = "" + n.charAt(i);
            if(nn.contains(c)) {
                answer = i+1;
                break;
            }
        }
        return answer;
    }
}