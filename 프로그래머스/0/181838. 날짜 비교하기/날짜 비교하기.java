import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;

class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        String str1 = "";
        String str2 = "";
        for(int i=0; i<date1.length; i++) {
            str1 += date1[i];
            if(i==date1.length-1) {
                continue;
            }
            str1 += "-";
        }
        for(int i=0; i<date2.length; i++) {
            str2 += date2[i];
            if(i==date2.length-1) {
                continue;
            }
            str2 += "-";
        }
        
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        
        try {
        Date d1 = formatter.parse(str1);
        Date d2 = formatter.parse(str2);
                if (d1.compareTo(d2) < 0) {
                return 1; // date2가 date1보다 이후
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        

        
        return answer;
    }
}