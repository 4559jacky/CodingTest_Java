import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        for(int i=2; i<=n; i++) {
            if(n%i==0) {
                n /= i;
                if(!list.contains(i)) {
                    list.add(i);
                }
                i--;
            }
        }
        // for(int i=0; i<list.size()-1; i++) {
        //     for(int j=i+1; j<list.size(); j++) {
        //         if(list.get(i)==list.get(j)) {
        //             list.remove(j);
        //         }
        //     }
        // }
//         for(int i=0; i<list.size(); i++) {
//             if(list.contains(i)) {
                
//             }
//         }
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}