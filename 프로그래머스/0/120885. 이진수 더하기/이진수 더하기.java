class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int n1 = 1;
        int n2 = 1;
        int sum = 0;
        for(int i=1; i<bin1.length(); i++) {
            n1 *= 2;
        }
        for(int i=1; i<bin2.length(); i++) {
            n2 *= 2;
        }
        for(int i=0; i<bin1.length(); i++) {
            char c = bin1.charAt(i);
            if(c=='1') {
                sum += n1;
            }
            n1 /= 2;
        }
        for(int i=0; i<bin2.length(); i++) {
            char c = bin2.charAt(i);
            if(c=='1') {
                sum += n2;
            }
            n2 /= 2;
        }
        // int num = 1;
        // int addNum = 0;
        // int count = 0;
        // while(sum>addNum) {
        //     addNum += num;
        //     num *= 2;
        //     count++;
        // }
        // num /= 2;
        // while(true) {
        //     int i = sum/num;
        //     sum %= num;
        //     answer += i;
        //     num /= 2;
        //     if(sum==0) {
        //         break;
        //     }
        // }
        // while(count!=answer.length()) {
        //     answer +=0;
        // }
        return Integer.toBinaryString(sum);
    }
}