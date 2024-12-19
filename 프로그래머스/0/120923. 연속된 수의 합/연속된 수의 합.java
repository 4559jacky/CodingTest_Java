class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int mid = 0;
        if(num%2!=0) {
            mid = total/num;
            answer[num/2] = mid;
            for(int i=num/2+1; i<answer.length; i++) {
                answer[i] = ++mid;
            }
            mid = total/num;
            for(int i=num/2-1; i>=0; i--) {
                answer[i] = --mid;
            }
        } else {
            mid = total/num;
            answer[num/2-1] = total/num;
            for(int i=num/2; i<answer.length; i++) {
                answer[i] = ++mid;
            }
            mid = total/num;
            for(int i=num/2-2; i>=0; i--) {
                answer[i] = --mid;
            }
        }
        return answer;
    }
}