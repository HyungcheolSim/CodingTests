import java.util.LinkedList;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        LinkedList<Integer> list =new LinkedList();
        for(int i=0;i<arr.length;i++){
            if(flag[i]){
                for(int j=0;j<arr[i]*2;j++){
                    list.addLast(arr[i]);
                }
            }else{
                for(int j=0;j<arr[i];j++){
                    list.removeLast();
                }
            }
        }
        int[] answer=new int[list.size()];
        for(int i=0;i<answer.length;i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}