import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] answer = myStr.split("[a-c]");
        
        List<String> list = new ArrayList<>();
        
        for(String s : answer) {
            if("".equals(s)) continue;
            list.add(s);
        }
        
        String[] result = {};
        
        if(list.size() >= 1) {
            result = new String[list.size()];
            for(int i=0; i<list.size(); i++) {
            result[i] = list.get(i);
            }
        } else {
            result = new String[1];
            result[0] = "EMPTY";
        }

        return result;
    }
}