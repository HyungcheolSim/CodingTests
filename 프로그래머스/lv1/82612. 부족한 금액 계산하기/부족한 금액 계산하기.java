class Solution {
    public long solution(int price, int money, int count) {
        //7분 38초
        long total=0;
        for(int i=1;i<=count;i++){
            total+=i*price;
        }
        
        return money-total>=0?0:(money-total)*-1;
    }
}