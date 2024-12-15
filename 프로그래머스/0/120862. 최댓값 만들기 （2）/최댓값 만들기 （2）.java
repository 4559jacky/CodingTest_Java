import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        // if(numbers.length==3&&numbers[1]==0) {
        //     return 0;
        // } else {
        //     int answer = 0;
        int length = numbers.length-1;
        int max1 = 0;
        int max2 = 0;
        Arrays.sort(numbers);
        
        max1 = numbers[0]*numbers[1];
        max2 = numbers[length]*numbers[length-1];

        int max = max1 > max2 ? max1 : max2;
        
        return max;
        }
        
    // }
}