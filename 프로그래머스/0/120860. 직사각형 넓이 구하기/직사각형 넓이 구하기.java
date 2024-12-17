class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int xMin = dots[0][0];
        int xMax = dots[0][0];
        int yMin = dots[0][1];
        int yMax = dots[0][1];
        for(int j=1; j<dots.length; j++) {
            if(xMin>dots[j][0]) {
                xMin = dots[j][0];
            }
            if(xMax<dots[j][0]) {
                xMax = dots[j][0];
            }
            if(yMin>dots[j][1]) {
                yMin = dots[j][1];
            }
            if(yMax<dots[j][1]) {
                yMax = dots[j][1];
            }
        }
        int x = xMax - xMin;
        int y = yMax - yMin;
        answer = x*y;
        answer = Math.abs(answer);
        return answer;
    }
}