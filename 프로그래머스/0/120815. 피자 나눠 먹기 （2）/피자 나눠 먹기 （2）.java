class Solution {
    public int solution(int n) {
        int answer = 0;
        int pizza = 1;
        while(true) {
            if((6*pizza)/n>=1&&((6*pizza)%n==0)) {
                break;
            }
            pizza++;
        }
        return pizza;
    }
}