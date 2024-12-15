class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int count = 0;
        for(String q : quiz) {
            int sum = 0;
            String[] strArr = q.split(" ");
            sum += Integer.parseInt(strArr[0]);
            sum += Integer.parseInt(strArr[2]);
            if(strArr[1].equals("-")) {
                sum -= 2*(Integer.parseInt(strArr[2]));
            }
            int result = Integer.parseInt(strArr[4]);
            if(sum==result) {
                answer[count++] = "O";
            } else {
                answer[count++] = "X";
            }
        }
        return answer;
    }
}