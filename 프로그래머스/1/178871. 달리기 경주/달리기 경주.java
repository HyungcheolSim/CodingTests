import java.util.Map;
import java.util.HashMap;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String,Integer> map=new HashMap();
        for(int i=0;i<players.length;i++){
            map.put(players[i],i);
        }
        
        for(String p:callings){
            int rank= map.get(p);
            String before=players[rank-1];
            
            players[rank-1]=p;
            players[rank]=before;
            map.put(p,rank-1);
            map.put(before,rank);
        }
        return players;
    }
}