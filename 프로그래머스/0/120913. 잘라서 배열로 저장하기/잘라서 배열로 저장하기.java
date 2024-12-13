class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = {};
        int length = my_str.length();
        int size = length%n==0 ? length/n : length/n+1;
        answer = new String[size];
        for(int i=0; i<size-1; i++) {
            answer[i] = my_str.substring(i*n, (i+1)*n);
        }
        answer[size-1] = my_str.substring((size-1)*n, length);
        return answer;
    }
}