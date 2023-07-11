class Solution {
    public int solution(int n) {
        if(n<2)
            return n;
        int sum = 0;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                sum+=i;
                if(n/i!=i){
                    sum+=n/i;
                }
            }
        }
        return sum;
    }
}