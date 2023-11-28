import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        LinkedList<Integer> list= new LinkedList();
        for(int i=0;i<arr.length;i++){
            if(list.size()==0){
               list.addLast(arr[i]);
            }else{
               if(list.getLast()==arr[i])
                   list.removeLast();
                else
                    list.addLast(arr[i]);
            }
        }
        if(list.size()==0){
            return new int[] {-1};
        }
        int[] answer=new int[list.size()];
        for(int i=0;i<answer.length;i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}