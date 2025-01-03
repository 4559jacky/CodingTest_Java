import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        for(int n : arr) {
            boolean bool = true;
            for(int m : delete_list) {
                if(n==m) bool = false;
            }
            if(bool==true) {
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