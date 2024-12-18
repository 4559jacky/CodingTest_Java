class Solution {
    public String solution(String polynomial) {
        String answer = "";
        StringBuilder sb = new StringBuilder(polynomial);
        while(sb.indexOf(" ")!=-1) {
            int idx = sb.indexOf(" ");
            sb.deleteCharAt(idx);
        }
        String result = sb.toString();
        String[] res = result.split("\\+");
        int xNum = 0;
        int num = 0;
        for(int i=0; i<res.length; i++) {
            if(res[i].equals("x")) {
                res[i] = "1x";
            }
        }
        for(String s : res) {
            if(s.contains("x")) {
                s = s.replace("x", "");
                xNum += Integer.parseInt(s);
            } else {
                num += Integer.parseInt(s);
            }
        }
        if(xNum!=0&&num==0) {
            if(xNum!=1) {
               return xNum + "x"; 
            } else {
                return "x"; 
            }
        } else if(xNum==0&&num!=0) {
            return String.valueOf(num);
        } else {
            if(xNum!=1) {
               return xNum + "x + " + num;
            } else {
               return "x + " + num;
            }
        } 

    }
}