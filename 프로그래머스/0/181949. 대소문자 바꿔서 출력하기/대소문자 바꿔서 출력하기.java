import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String str = "";
        char[] ch = a.toCharArray();
        for(char c : ch) {
            if(Character.isLowerCase(c)) {
                str += String.valueOf(Character.toUpperCase(c));
            } else {
                str += String.valueOf(Character.toLowerCase(c));
            }
        }
        System.out.println(str);
    }
}