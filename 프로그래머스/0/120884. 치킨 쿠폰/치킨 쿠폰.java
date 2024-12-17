class Solution {
    public int solution(int chicken) {
        int coupon = 0;
        int sum = 0;
        while(true) {
        	if(chicken/10<1) {
        		coupon += chicken;
        		break;
        	}
        	sum += chicken/10;
        	coupon += chicken%10;
        	chicken /= 10;
        }
        while(coupon/10>1) {
        	sum += coupon/10;
        	coupon = coupon/10 + coupon%10;
        }
        sum += coupon/10;
        return sum;
    }
}