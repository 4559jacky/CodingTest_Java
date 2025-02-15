import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        int count = 0;
        list.add(n);
        while(true) {
            if(n==1) {
                break;
            }
            if(n%2!=0) {
                n = 3*n+1;
                list.add(n);
            } else {
                n /= 2;
                list.add(n);
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}