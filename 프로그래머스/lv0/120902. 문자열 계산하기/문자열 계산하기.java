import java.util.*;
class Solution {
    public int solution(String my_string) {
        String[] a= my_string.split(" ");
        int sum=0;
        boolean sign=true;
        for(int i=0;i<a.length;i++){
            if(Objects.equals(a[i],"+")){
                sign=true;
            }else if(Objects.equals(a[i],"-")){
                sign=false;
            }else{
                sum=sign?sum+Integer.parseInt(a[i]):sum-Integer.parseInt(a[i]);
            }
       }
        return sum;
    }
}