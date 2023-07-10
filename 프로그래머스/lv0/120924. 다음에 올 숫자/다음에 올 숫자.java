class Solution {
    public int solution(int[] c) {
        return (c[c.length-1]-c[c.length-2]==c[c.length-2]-c[c.length-3])?
             c[c.length-1]+(c[c.length-1]-c[c.length-2]): c[c.length-1]*(c[c.length-1]/c[c.length-2]);
    }
}