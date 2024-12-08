class Solution {
    public int solution(int[] sides) {
        int answer = 2;
        int max = 0;
        int idx = 0;
        for(int i=0; i<sides.length; i++) {
            if(max<sides[i]) {
                max = sides[i];
                idx = i;
            }
        }
        int sum = 0;
        for(int i=0; i<sides.length; i++) {
            if(i != idx) {
                sum += sides[i];
            }
        }
        if(max<sum) {
            answer = 1;
        }
        return answer;
    }
}