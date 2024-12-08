class Solution {
    public int solution(int n) {
        int answer = 0;
        String numStr = Integer.toString(n);
        int sum = 0;
        for(int i=0; i<numStr.length(); i++) {
            String num = "" + numStr.charAt(i);
            int a = Integer.valueOf(num);
            sum += a;
        }
        return sum;
    }
}