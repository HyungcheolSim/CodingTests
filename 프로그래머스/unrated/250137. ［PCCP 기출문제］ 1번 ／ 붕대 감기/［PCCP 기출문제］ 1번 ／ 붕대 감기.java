class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        // 소요 시간 57:10
        int life=health;
        int idx=0;
        int duration=1;
        for(int i=1;i<=attacks[attacks.length-1][0];i++){
            if(i!=attacks[idx][0]){ //회복한 경우
                duration++;
                life+=bandage[1];
                if(duration == bandage[0]){
                    duration=0;
                    life+=bandage[2];
                }
                if(life>health)
                    life=health;
            }else{ //공격받은 경우
                life-=attacks[idx++][1];
                duration=0;
            }
            if(life<=0)
                    return -1;
        }
        return life;
    }
}