class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int count = 1;
        int a = 0;
        while(count<=k) {
            if(a>numbers.length-1) {
                a -= numbers.length;
            }
            answer = numbers[a];
            a += 2;
            count++;
        }
        return answer;
    }
}