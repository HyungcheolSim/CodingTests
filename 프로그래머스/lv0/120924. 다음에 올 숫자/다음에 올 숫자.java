class Solution {
    public int solution(int[] c) {
        if(c[c.length-1]-c[c.length-2]==c[c.length-2]-c[c.length-3]){
            //등차
            int diff=c[c.length-1]-c[c.length-2];
            return c[c.length-1]+diff;
        }else{
            //등비
            int diff=c[c.length-1]/c[c.length-2];
            return c[c.length-1]*diff;
        }
    }
}