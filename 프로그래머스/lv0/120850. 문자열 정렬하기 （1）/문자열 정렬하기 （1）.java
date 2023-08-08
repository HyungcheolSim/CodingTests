import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        List<Integer>arr= new ArrayList<Integer>();
        for(char ch:my_string.toCharArray()){
            if(ch>='0'&& ch<='9'){
                arr.add(ch-'0');
            }
        }
        Collections.sort(arr);
        int[] answer=new int[arr.size()];
        for(int i=0;i<arr.size();i++)
            answer[i]=arr.get(i).intValue();
        return answer;
    }
}