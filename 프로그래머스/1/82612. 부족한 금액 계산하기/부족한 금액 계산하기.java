class Solution {
    public long solution(int price, int money, int count) {
        //놀이기구를 count 번 타게되면 money에서 얼마나 모자라는지 모자라지 않으면 0 return
        long totalPrice=0;
        for(int i=1;i<=count;i++){
            totalPrice+=price*i;
        }
        long charge=totalPrice-money;
        return charge<=0?0:charge;
    }
}