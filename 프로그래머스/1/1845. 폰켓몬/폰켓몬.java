import java.util.*;
class Solution {
    public int solution(int[] nums) {
        Set<Integer> set= new HashSet();
        for(int i:nums){
            set.add(i);    
        }        
        
        //선택 가능한 종류의 수
        int n=nums.length;
        int c=set.size();
        return c>n/2?n/2:c;
        
    }
}