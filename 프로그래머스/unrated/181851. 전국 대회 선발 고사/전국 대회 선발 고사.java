import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        Map<Integer,Integer> map = new HashMap();
        for(int i=0;i<rank.length;i++){
            if(attendance[i]){
                map.put(rank[i],i);   
            }
        }
        List<Integer> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet);
        int[] answer=new int[map.size()];
        for(int i=0;i<answer.length;i++){
            answer[i]=keySet.get(i);
        }
        
        return map.get(answer[0])*10000+map.get(answer[1])*100+map.get(answer[2]);
    }
}