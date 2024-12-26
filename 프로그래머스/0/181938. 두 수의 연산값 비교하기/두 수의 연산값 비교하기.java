class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String strNum = String.valueOf(a)+String.valueOf(b);
        int num = 2*a*b;
        return Integer.parseInt(strNum) > num ? Integer.parseInt(strNum) : num;
    }
}