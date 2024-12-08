class Solution {
    public int solution(int n) {
        int pizza = 1;
        while(true) {
            if((7*pizza)/n>=1) {
                break;
            }
                pizza++;
            }
        return pizza;
        }
    }