class Solution {
    public int solution(int n) {
        int answer = 0;
        int sum = 1;
        int i = 1;
        while(true) {
            if(n<sum) {
                i--;
                break;
            }
            sum *= i;
            i++;
        }
        return --i;
    }
}