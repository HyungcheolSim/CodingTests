import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> st= new Stack();
        
        for(int i=0;i<arr.length;i++){
            if(st.empty()||st.peek()!=arr[i])
                st.push(arr[i]);
        }
        int[] answer=new int[st.size()]; 
        for(int i=answer.length-1;i>=0;i--){
            answer[i]=st.pop();
        }
        return answer;
    //     int pop=st.pop();
     
    //     int i=0;
    //     while(!st.empty()){
    //         if(pop!=st.peek())
    //             pop=st.pop();
    //         else{
    //             answer[i++]=pop;
    //         }
    //     }
    // return answer;        
    }    
}