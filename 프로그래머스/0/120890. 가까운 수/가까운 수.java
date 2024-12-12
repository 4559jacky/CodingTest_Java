import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int answer = 0;
        int min = n - array[0];
        answer = array[0];
        for(int i=1; i<array.length; i++) {
            int num = n - array[i];
            if(num<0) {
                num -= 2*num;
            }
            if(min>num) {
                min = num;
                answer = array[i];
            }
        }
        return answer;
        // for(int a : array) {
        //     int num = n-a;
        //     if(num<0) {
        //         num -= 2*num;
        //     }
        //     if(min>num) {
        //         min = num;
        //         answer = a;
        //     }
        // }
    }
}