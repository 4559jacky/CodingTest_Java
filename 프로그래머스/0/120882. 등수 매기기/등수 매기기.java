import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        int[] sum = new int[score.length];
        for(int i=0; i<score.length; i++) {
            sum[i] = score[i][0]+score[i][1];
        }
        List<Integer> rank = new ArrayList<>();
        for(int s : sum) {
            rank.add(s);
        }
        Collections.sort(rank, Collections.reverseOrder());
        int[][] scoreRank = new int[rank.size()][2];
        
        int count = 1;
        scoreRank[0][0] = rank.get(0);
        scoreRank[0][1] = count++;
        for(int i=1; i<sum.length; i++) {
            scoreRank[i][0] = rank.get(i);
            scoreRank[i][1] = count++;
        }
        for(int i=1; i<scoreRank.length; i++) {
            if(scoreRank[i][0]==scoreRank[i-1][0]) {
                scoreRank[i][1] = scoreRank[i-1][1];
            }
        }
        
        for(int i=0; i<scoreRank.length; i++) {
            for(int j=0; j<scoreRank.length; j++) {
              if(sum[i]==scoreRank[j][0]) {
                answer[i] = scoreRank[j][1];
                }
            }
        }
        return answer;
    }
}