class Solution {
    public int solution(int n) {
        int answer = 0;
        int count_i = 0;
        int count_j = 0;
        for(int i=1; i<=n; i++) {
            count_j = 0;
            for(int j=1; j<=i; j++) {
                if(i%j==0) {
                    count_j++;
                }
            }
            if(count_j>=3) {
                count_i++;
            }
        }
        
        return count_i;
    }
}