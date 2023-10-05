class Solution {
    public long[] solution(int x, int n) {
        //x부터 시작해 x씩 증가 n개
        long[] ans=new long[n];
        ans[0]=x;
        for(int i=1;i<n;i++){
            ans[i]=ans[i-1]+x;
        }
        return ans;
    }
    

}