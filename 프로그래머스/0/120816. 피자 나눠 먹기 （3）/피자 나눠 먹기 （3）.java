class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        int pizza = 1;
        while(true) {
            if((pizza*slice)/n>=1) {
                break;
            }
            pizza++;
        }
        return pizza;
    }
}