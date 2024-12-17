import java.util.*;

class Solution {
    public int solution(int a, int b) {
        int answer = 2;
        int min =  a < b ? a : b;
        for(int i=min; i>=2; i--) {
            if(a%i==0&&b%i==0) {
                a /= i;
                b /= i;
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int i=2; i<=b; i++) {
            if(b%i==0) {
                list.add(i);
                b/=i;
                i--;
            }
        }
        int count = 0;
        for(int num : list) {
            if(num%2==0||num%5==0) {
                count++;
            }
        }
        if(count==list.size()) {
            answer = 1;
        }
        return answer;
    }
}