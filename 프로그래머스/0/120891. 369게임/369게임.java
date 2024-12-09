class Solution {
    public int solution(int order) {
        int answer = 0;
        String n = "" + order;
        int count = 0;
        char[] charArr = n.toCharArray();
        for(char c : charArr) {
            if(c=='3'||c=='6'||c=='9') {
                count++;
            }
        }
        return count;
    }
}