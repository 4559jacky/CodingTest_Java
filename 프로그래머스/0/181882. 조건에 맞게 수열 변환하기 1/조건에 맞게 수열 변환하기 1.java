class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        int count=0;
        for(int n : arr) {
            if(n>=50&&n%2==0) {
                answer[count++] = n/2;
            } else if(n<50&&n%2!=0) {
                answer[count++] = n*2;
            } else {
                answer[count++] = n;
            }
        }
        return answer;
    }
}