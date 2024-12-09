import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        char[] charArr = my_string.toCharArray();
        int count = 0;
        for(char c : charArr) {
            if(48<=(int)c&&(int)c<=57) {
                count++;
            }
        }
        int[] intArr = new int[count];
        count = 0;
        for(char c : charArr) {
            if(48<=(int)c&&(int)c<=57) {
                intArr[count++] = (int)c-'0';
            }
        }
        Arrays.sort(intArr);
        return intArr;
    }
}