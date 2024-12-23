class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int safeArea = 0;;
        
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[i].length; j++) {
                if(board[i][j]==1) {
                    if(i-1>=0&&j-1>=0) { //1
                        if(board[i-1][j-1]==0) {
                            board[i-1][j-1] = 2;
                        }
                    }
                    if(i<board.length-1&&j<board.length-1){ //9
                        if(board[i+1][j+1]==0) {
                            board[i+1][j+1] = 2;
                        }
                    }
                    if(i-1>=0&&j<board.length-1) {//7
                        if(board[i-1][j+1]==0) {
                            board[i-1][j+1] = 2;
                        }
                    }
                    if(i<board.length-1&&j-1>=0) {//3
                        if(board[i+1][j-1]==0) {
                            board[i+1][j-1] = 2;
                        }
                    }
                    if(i-1>=0) {//2
                        if(board[i-1][j]==0) {
                            board[i-1][j] = 2;
                        }
                    }
                    if(j-1>=0) {//4
                        if(board[i][j-1]==0) {
                            board[i][j-1] = 2;
                        }
                    }
                    if(i<board.length-1) {//6
                        if(board[i+1][j]==0) {
                            board[i+1][j] = 2;
                        }
                    }
                    if(j<board.length-1) {//8
                        if(board[i][j+1]==0) {
                            board[i][j+1] = 2;
                        }
                    }
                }
            }
        }
        
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[i].length; j++) {
                if(board[i][j]==0) {
                    safeArea++;
                }
            }
        }
        
        return safeArea;
    }
}