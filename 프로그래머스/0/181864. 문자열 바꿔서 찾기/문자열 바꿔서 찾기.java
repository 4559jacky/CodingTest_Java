class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        // StringBuilder sb = new StringBuilder(myString);
        // sb.replace("A", "a");
        // sb.replace("B", "b");
        // sb.replace("a", "B");
        // sb.replace("b", "A");
        myString = myString.replace("A", "a");
        myString = myString.replace("B", "b");
        myString = myString.replace("a", "B");
        myString = myString.replace("b", "A");
        if(myString.contains(pat)) answer = 1;
        return answer;
    }
}