class Solution {
    public int[] solution(int[] emergency) {
        int[] result = emergency.clone();
        for(int i=0; i<result.length-1; i++) {
            for(int j=i+1; j<result.length; j++) {
                if(result[i]<result[j]) {
                    int temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
        }
        int[] answer = new int[emergency.length];
        for(int i=0; i<emergency.length; i++) {
            for(int j=0; j<emergency.length; j++) {
                if(emergency[i]==result[j]) {
                    answer[i] = j+1;
                }
            }
        }
        
        return answer;
    }
}