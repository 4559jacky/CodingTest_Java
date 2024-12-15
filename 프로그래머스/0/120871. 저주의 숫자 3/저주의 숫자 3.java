class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        while(count<n) {
            answer++;
            while(true) {
                if(answer%3==0||Integer.toString(answer).contains("3")) {
                    answer++;
                } else {
                    break;
                }
            }
            count++;
        }
        return answer;
    }
}