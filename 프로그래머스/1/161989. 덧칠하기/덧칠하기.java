import java.util.ArrayList;
class Solution {
    public int solution(int n, int m, int[] section) {
        //section의 원소들을 m 씩 나누어 제거
        int count=1;
        int start=section[0];
        int end=section[0]+m-1;
        for(int i=0;i<section.length;i++){
            if(section[i]>end){
                start=section[i];
                end=section[i]+m-1;
                count++;
            }
        }
        return count;
    }
}