import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        List<String> list = new ArrayList<>();
        String[] strArr = s.split("");
        for(int i=0; i<strArr.length; i++) {
            String word = strArr[i];
            String sss = s.substring(0, i)+
                        s.substring(i+1, s.length());
            if(!sss.contains(word)) {
                list.add(word);
            }
        }
//         for(String str : strArr) {
            
//             if(list.contains(str)) {
//                 list.remove(str);
//             } else {
//                 list.add(str);
//             }
//         }
        Collections.sort(list);
        for(String a : list) {
            answer += a;
        }
        String ss = s.substring(0,0)+s.substring(1, s.length());
        return answer;
    }
}