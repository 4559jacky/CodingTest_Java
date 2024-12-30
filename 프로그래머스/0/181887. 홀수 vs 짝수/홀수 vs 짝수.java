class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int even = 0;
        int odd = 0;
        for(int i=0; i<num_list.length; i++) {
            if(i%2==0) { // 홀수원소
                odd += num_list[i];
            } else { // 짝수원소
                even += num_list[i];
            }
        }
        return odd>even ? odd : even;
    }
}