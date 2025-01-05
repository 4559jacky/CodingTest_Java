class Solution {
    public String[] solution(String[] strArr) {
        int count = 0;
        for(String s : strArr) {
            if(s.contains("ad")) count++;
        }
        String[] answer = new String[strArr.length-count];
        count = 0;
        for(int i=0; i<strArr.length; i++) {
            if(strArr[i].contains("ad")) continue;
            answer[count++] = strArr[i];
        }
        return answer;
    }
}