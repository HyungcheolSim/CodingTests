class Solution {
    public int solution(int[][] board, int k) {
        //i+j<=k인 모든 i,j에 대한 합
        int sum=0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(i+j<=k){
                    sum+=board[i][j];
                }
            }
        }
        return sum;
    }
}