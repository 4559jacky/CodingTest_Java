class Solution {
    public int solution(long balls, long share) {
        long answer = 1;
        
        for(int i = 1; i <= share; i++) {
			answer = answer * (balls - i + 1) / i;
		}
        
        return (int)answer;
    }
}