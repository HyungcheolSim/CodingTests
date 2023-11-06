class Solution {
    public int solution(int n) {
        int i=n%2==1?1:0;
        int sum=0;
        for(i=i;i<=n;i+=2){
            int num=(i%2==0)?i*i:i;
            sum+=num;  
        }
        return sum;
    }
}