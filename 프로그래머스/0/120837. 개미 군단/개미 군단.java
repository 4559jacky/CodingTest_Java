class Solution {
    public int solution(int hp) {
        int answer = 0;
        int ant = 0;
        ant += hp/5;
        hp %= 5;
        ant += hp/3;
        hp %= 3;
        ant += hp;
        return ant;
    }
}