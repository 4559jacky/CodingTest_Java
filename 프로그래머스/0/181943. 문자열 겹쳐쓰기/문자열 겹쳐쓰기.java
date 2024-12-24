class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        int idx = s+overwrite_string.length();
        // String str = my_string.substring(s, idx);
        // my_string = my_string.replace(str,overwrite_string);
        my_string = my_string.substring(0, s)
            +overwrite_string+my_string.substring(idx);
        return my_string;
    }
}