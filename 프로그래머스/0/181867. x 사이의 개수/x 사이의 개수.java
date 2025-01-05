class Solution {
    public int[] solution(String myString) {
        int count = 1;
        for(String s : myString.split("")) {
            if(s.equals("x")) count++;
        }
        int[] answer = new int[count];
        int cnt = 0;
        for(String s : myString.split("x")) {
            answer[cnt++] = s.length();
        }
        return answer;
    }
}