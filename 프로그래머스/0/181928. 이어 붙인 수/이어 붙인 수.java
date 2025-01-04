class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(int i : num_list) {
            if(i%2!=0) {
                sb1.append(String.valueOf(i));
            } else {
                sb2.append(String.valueOf(i));
            }
        }
        return Integer.parseInt(sb1.toString())+Integer.parseInt(sb2.toString());
    }
}