class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for(String o : order) {
            if(o.equals("iceamericano") || o.equals("americanoice") || o.equals("americano") ||
              o.equals("hotamericano") || o.equals("americanohot") || o.equals("anything")) {
                answer += 4500;
            } else {
                answer += 5000;
            }
        }
        return answer;
    }
}