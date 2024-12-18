class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        boolean bool = false;
        String str = A;
        int count = 0;
        while(count<B.length()) {
        	if(str.equals(B)) {
            	bool = true;
            	break;
            }
        	String[] arrA = str.split("");
            String[] arrC = new String[arrA.length];
            arrC[0] = arrA[arrA.length-1];
            for(int i=1; i<arrA.length; i++) {
            	arrC[i] = arrA[i-1];
            }
            str = "";
            for(String c : arrC) {
            	str += c;
            }
            count++;
        }
        if(bool) {
        	answer = count;
        }
        return answer;
    }
}