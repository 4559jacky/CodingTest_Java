import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        List<String> list = new ArrayList<String>();
        for(int i=0; i<names.length; i+=5) {
            if(i%5==0) list.add(names[i]);
            if(i>=names.length-4) break;
        }
        
        return list.toArray(new String[list.size()]);
    }
}