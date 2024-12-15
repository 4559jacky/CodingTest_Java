class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int n = 0;
        int max = sides[0] > sides[1] ? sides[0] : sides[1];
        int min = sides[0] < sides[1] ? sides[0] : sides[1];
        for(int i=1; i<=max+min; i++) {
            if(max>=i) {
               if(max<min+i) {
                answer++;
                } 
            } else if(i>max) {
                if(i<max+min) {
                    answer++;
                }
            }
            
        }
        return answer;
    }
}