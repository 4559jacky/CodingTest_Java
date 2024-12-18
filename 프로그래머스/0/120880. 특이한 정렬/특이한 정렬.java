class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        int[][] result = new int[numlist.length][2];
        int count = 0;
        for(int num : numlist) {
            int min = n-num;
            result[count][0] = num;
            result[count][1] = min;
            count++;
        }
        int x = 0;
        int y = 0;
        int[] numArr = new int[result.length];
        for(int i=0; i<result.length; i++) {
            numArr[i] = result[i][1];
        }
        for(int i=0; i<numArr.length-1; i++) {
            for(int j=i+1; j<numArr.length; j++) {
                x = Math.abs(numArr[i]);
                y = Math.abs(numArr[j]);
                if(x>y) {
                    int temp = numArr[i];
                    numArr[i] = numArr[j];
                    numArr[j] = temp;
                } else if(x==y) {
                    if(numArr[i]>numArr[j]) {
                        int temp = numArr[i];
                        numArr[i] = numArr[j];
                        numArr[j] = temp;
                    }
                }
            }
        }
        
        for(int i=0; i<numArr.length; i++) {
        	for(int j=0; j<result.length; j++) {
        		if(numArr[i]==result[j][1]) {
        			answer[i] = result[j][0];
        		}
        	}
        }
        
        return answer;
    }
}