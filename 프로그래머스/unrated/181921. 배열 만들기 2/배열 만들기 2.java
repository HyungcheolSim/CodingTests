import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list= new ArrayList();
        
        for(int i=l;i<=r;i++){
            String str=String.valueOf(i);
            boolean b=false;
            for(char ch:str.toCharArray()){
                if(!(ch=='5'||ch=='0')){
                    b=true;
                    break;
                }
            }
            if(!b){
                list.add(i);
            }
        }
        if(list.isEmpty())
            return new int[] {-1};
        return list.stream().mapToInt(x->x).toArray();
    }
}