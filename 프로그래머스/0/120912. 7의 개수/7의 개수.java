class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String sum = "";
        for(int a : array) {
            sum += a;
        }
        int count = 0;
        char[] charArr = sum.toCharArray();
        for(char c : charArr) {
            if(c == '7') {
                count++;
            }
        }
        return count;
    }
}