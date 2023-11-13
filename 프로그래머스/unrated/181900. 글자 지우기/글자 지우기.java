import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        List<String> list= new ArrayList(Arrays.asList(my_string.split("")));
        for(int i:indices){
          list.set(i,"");
        }  
        return String.join("",list);
    }
}