import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int count=0;
        int[] ex=new int[arr.length];
        while(!Arrays.equals(ex,arr)){
            ex=Arrays.copyOf(arr,arr.length);
            for(int i=0;i<arr.length;i++){
                if(arr[i]>=50 && arr[i]%2==0){
                    arr[i]/=2;
                }
                else if(arr[i]<50 && arr[i]%2==1){
                    arr[i]=arr[i]*2+1;
                }
            }
            count++;    
        }
        return count-1;
        
    }
}