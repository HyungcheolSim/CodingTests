import java.util.*;
class Solution {
    public int solution(String[] spell, String[] dic) {
        List<String> list=new ArrayList<>();
            list.addAll(Arrays.asList(dic));
        for(String sp:spell){
            for(Iterator<String> iterator=list.iterator();iterator.hasNext();){
                String item=iterator.next();
                if(!item.contains(sp))
                    iterator.remove();
            }
        }
        return list.isEmpty()?2:1;
    }
}