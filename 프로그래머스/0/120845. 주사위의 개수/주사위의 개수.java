class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        int sum = 1;
        for(int b : box) {
            sum *= b/n;
        }
        return sum;
    }
}