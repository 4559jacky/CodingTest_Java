class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        // a, b, c가 같을 때
        if(a==b && b==c) {
            answer = (a+b+c)*(a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c);
        } else {
            // a,b,c가 다 다를 때
            if(a!=b&&b!=c&&c!=a) {
                answer = a + b + c;
            } // 하나라도 같을 때
            else {
                answer = (a+b+c)*(a*a+b*b+c*c);
            }
        }
        return answer;
    }
}