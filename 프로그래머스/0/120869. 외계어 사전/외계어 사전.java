import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        Arrays.sort(spell);
        for(String d : dic) {
            String[] dArr = d.split("");
            Arrays.sort(dArr);
            if(dArr.length==spell.length) {
                int count = 0;
                for(int i=0; i<dArr.length; i++) {
                    if(dArr[i].equals(spell[i])) {
                        count++;
                    }
                }
                if(count==spell.length) {
                    answer = 1;
                }
            }
        }
        return answer;
    }
}