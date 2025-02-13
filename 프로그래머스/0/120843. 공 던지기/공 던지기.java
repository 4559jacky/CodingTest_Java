class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int numIndex = numbers.length-1;
        int idx = 0;
        for(int i=0; i<k; i++) {
            answer = numbers[idx];
            if(idx == numIndex) {
                idx = 1;
            } else if(idx == numIndex-1) {
                idx = 0;
            } else {
                idx+=2;
            }
        }
        
        
        return answer;
    }
}