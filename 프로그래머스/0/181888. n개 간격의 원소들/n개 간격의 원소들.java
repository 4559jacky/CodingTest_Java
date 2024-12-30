import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<num_list.length;) {
            list.add(num_list[i]);
            if(i+n<=num_list.length) {
                i+=n;
            } else {
                break;
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}