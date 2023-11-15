import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int[] query) {        
        int[] answer=new int[query.length];
          
        // for(int i:query){
        //     if(i%2==0){
        //         arr=Arrays.copyOf(arr,i+1);
        //     }else{
        //         arr=Arrays.copyOfRange(arr,i,arr.length);
        //     }
        //     System.out.println(Arrays.toString(arr));
        // }
        // Arrays.sort(arr);  
        
        for(int j=0;j<query.length;j++){  
            if(j%2==0){
                arr=Arrays.copyOfRange(arr,0,query[j]+1);
            }else{
                arr=Arrays.copyOfRange(arr,query[j],arr.length);
            }
            
        }
    
        return arr;        
    }
}