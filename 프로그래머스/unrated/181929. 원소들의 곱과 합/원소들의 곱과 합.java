class Solution {
    public int solution(int[] num_list) {
        //모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1:0
        int mx=0;
        int xm=1;
        for(int i:num_list){
            mx+=i;
            xm*=i;
        }
        return xm<mx*mx?1:0;
            
    }
}