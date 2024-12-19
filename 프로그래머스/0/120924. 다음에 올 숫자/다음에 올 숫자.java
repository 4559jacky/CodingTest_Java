class Solution {
	public int solution(int[] common) {
        int answer = 0;
        for(int i=2; i<common.length; i++) {
            if(common[i]-common[i-1]
              ==common[i-1]-common[i-2]) {
                answer = 2*common[i]-common[i-1];
            } else {
                answer = common[i]*(common[i]/common[i-1]);
            }
        }
        return answer;
        
        
        // int gongbi = common[1]/common[0];
        // int gongcha = common[1]-common[0];
        // if(common[2]-common[1]==gongcha) {
        //     answer = common[common.length-1] + gongcha;
        // } else {
        // 	answer = common[common.length-1]*gongbi;
        // }
        // return answer;
    }
}