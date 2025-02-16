import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int max = 0;
        for(String s : strArr) {
            int num = s.length();
            if(max < num) {
                max = num;
            }
        }
        
        int[][] intArr = new int[max][2];
        
        int n = 1;
        
        for(int[] a : intArr) {
            a[0] = n++;
            a[1] = 0;
        }
        
        // Map<Integer,Integer> map = new HashMap<>();
        
        for(String s : strArr) {
            int num = s.length();
            for(int i=0; i<intArr.length; i++) {
                if(intArr[i][0] == num) {
                    intArr[i][1]++;
                }
            }
        }
        
        max = 0;
        
        for(int i=0; i<intArr.length; i++) {
            if(max < intArr[i][1]) {
                max = intArr[i][1];
            }
        }
        
        return max;
    }
}