import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        int count = 0;
        for(String str : intStrs) {
            str = str.substring(s, s+l);
            int num = Integer.parseInt(str);
            if(k<num) {
                list.add(num);
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}