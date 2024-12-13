class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String[] alpha = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i=0; i<alpha.length; i++) {
            String str = i+"";
            if(numbers.contains(alpha[i])) {
                numbers = numbers.replace(alpha[i], str);
            }
        }
        answer = Long.parseLong(numbers);
        return answer;
    }
}