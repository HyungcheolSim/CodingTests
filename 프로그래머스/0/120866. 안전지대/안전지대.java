class Solution {
    public int solution(int[][] board) {
        int N = board.length;
        
        int[][] answer=new int[N][N];
        int count=0;
        
        //전체 배열 반복하며 위험지역 표시
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(board[i][j]==1){
                    for(int x = -1 ; x<= 1 ; x++){
                        for(int y = -1 ; y<= 1 ; y++){
                            if(x+i<N && y+j<N){
                                if(x+i>=0 && y+j>=0){
                                    answer[i+x][j+y]++;        
                                }
                            }                            
                        }
                    }
                    
                }
            }
        }
        //안전지역 계산
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(answer[i][j]==0)
                    count++;
            }
        }
        return count;
    }
}