import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int num=1;
        while(num<arr.length){
            num*=2;
        }
        return Arrays.copyOf(arr,num);

    }
}