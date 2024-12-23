class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int count = 0;
        double[] same = new double[2];
        // 기울기 공식
        // (y2-y1)/(x2-x1)
        for(int i=1; i<dots.length; i++) {
            if(i==1) {
                if((double)(dots[0][1]-dots[i][1])/(dots[0][0]-dots[i][0])
                  ==(double)(dots[i+1][1]-dots[i+2][1])/(dots[i+1][0]-dots[i+2][0])) answer = 1;
            } else if(i==2){
                if((double)(dots[0][1]-dots[i][1])/(dots[0][0]-dots[i][0])
                  ==(double)(dots[i-1][1]-dots[i+1][1])/(dots[i-1][0]-dots[i+1][0])) answer = 1;
            } else if(i==3) {
                if((double)(dots[0][1]-dots[i][1])/(dots[0][0]-dots[i][0])
                  ==(double)(dots[i-1][1]-dots[i-2][1])/(dots[i-1][0]-dots[i-2][0])) answer = 1;
            }
            
        }
        return answer;
    }
}