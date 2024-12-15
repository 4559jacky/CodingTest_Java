class Solution {
    public int solution(int M, int N) {
        int answer = 0;
        int num = M;
        while(M!=1) {
            M -= 1;
            answer++;
        }
        while(num!=0) {
            int num2 = N;
            while(num2!=1) {
            num2 -= 1;
            answer++;
            }
            num--;
        }
        
        return answer;
    }
}