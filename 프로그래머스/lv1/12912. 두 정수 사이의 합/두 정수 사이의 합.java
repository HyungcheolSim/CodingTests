class Solution {
    public long solution(int a, int b) {
        long sum=0;
        long max=a>b?a:b;
        long min= max==a?b:a;
        for(long i=min;i<=max;i++){
            sum+=i;
        }
        return sum;
    }
}