import java.util.*;
class Solution {
    public int solution(String before, String after) {
        char[] a= before.toCharArray();
        Arrays.sort(a);
        char[] b= after.toCharArray();
        Arrays.sort(b);
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]){
                return 0;
            }
        }
        return 1;
    }
        
}