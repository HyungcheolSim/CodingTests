class Solution {
    int com(int n,int r){
        return (n==r||r==0)?1:com(n-1,r-1)+com(n-1,r);
    }
    public int solution(int balls, int share) {
        return com(balls,share);
    }
}