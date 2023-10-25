import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        //가장 많은 부서에 물품을 구매해주려면 오름차순으로 정렬하고 할당
        Arrays.sort(d);
        int answer=0;
        for(int i:d){
            budget-=i;
            if(budget<0)
                return answer;
            answer++;
        }
        return answer;
        
    }
}