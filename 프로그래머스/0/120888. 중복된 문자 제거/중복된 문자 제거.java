class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] strArr = my_string.split("");
        for(int i=0; i<strArr.length-1; i++) {
            for(int j=i+1; j<strArr.length; j++) {
                if(strArr[i].equals(strArr[j])) {
                    strArr[j] = "";
                }
            }
        }
        for(String s : strArr) {
            answer += s;
        }
        return answer;
    }
}