class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        int sum = 0;
        for(int a : numbers) {
            if(sum>n) {
                break;
            }
            sum += a;
        }
        return sum;
    }
}