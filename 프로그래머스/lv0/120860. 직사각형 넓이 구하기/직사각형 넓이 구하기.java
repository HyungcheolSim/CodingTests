class Solution {
    public int solution(int[][] dots) {
        int x=dots[0][0];
        int y=dots[0][1];
        int width=0;
        int height=0;
        for(int i=1;i<dots.length;i++){
                if(x==dots[i][0])
                    height=Math.abs(y-dots[i][1]);
                else if(y==dots[i][1])
                    width=Math.abs(x-dots[i][0]);
        }
        return width*height;
    }
}