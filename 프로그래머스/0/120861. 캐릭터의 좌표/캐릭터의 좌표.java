class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        for(String key : keyinput) {
            if(key.equals("up")) {
                if(answer[1]==board[1]/2) {
                    continue;
                }
                answer[1] += 1;
            } else if(key.equals("down")) {
                if(answer[1]==-(board[1]/2)) {
                    continue;
                }
                answer[1] -= 1;
            } else if(key.equals("left")) {
                if(answer[0]==-(board[0]/2)) {
                    continue;
                }
                answer[0] -= 1;
            } else if(key.equals("right")) {
                if(answer[0]==board[0]/2) {
                    continue;
                }
                answer[0] += 1;
            }
        }
        return answer;
    }
}