class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] pos={0,0};
        for(String s:keyinput){
            if(s.equals("up")&&pos[1]<(board[1]/2))
                pos[1]++;
            else if(s.equals("down")&&pos[1]>(-board[1]/2))
                pos[1]--;
            else if(s.equals("left")&&pos[0]>(-board[0]/2))
                pos[0]--;
            else if(s.equals("right")&&pos[0]<(board[0]/2))
                pos[0]++;
        }
        return pos;
    }
}