class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String strNum1 = String.valueOf(a)+String.valueOf(b);
        String strNum2 = String.valueOf(b)+String.valueOf(a);
        
        return Integer.parseInt(strNum1) > Integer.parseInt(strNum2) ? Integer.parseInt(strNum1) : Integer.parseInt(strNum2);
    }
}