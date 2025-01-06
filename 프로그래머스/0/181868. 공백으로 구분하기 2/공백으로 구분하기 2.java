class Solution {
    public String[] solution(String my_string) {
        
        my_string = my_string.trim();
        String[] answer = my_string.split(" ");
        int count = 0;
        for(String s : answer) {
            if(s.equals("")) continue;
            count++;
        }
        String[] a = new String[count];
        count = 0;
        for(String s : answer) {
            if(s.equals("")) continue;
            a[count++] = s;
        }
        return a;
    }
}