import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        //못품!
        String[] arr= new String[numbers.length];
        boolean isZero = true;
        
        for(int i=0;i<numbers.length;i++){
            if(isZero && numbers[i] != 0){
                isZero = false;
            }
            arr[i]=String.valueOf(numbers[i]);
        }
        if(isZero){
            return "0";
        }
        
        Arrays.sort(arr,(o1,o2)->(o2+o1).compareTo(o1+o2));
        
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}