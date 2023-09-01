import java.util.*;
class Solution {
    public String solution(String s) {
        //s에서 한 번만 등장하는 문자를 사전순으로 정렬한 문자열
        char[] chArr=s.toCharArray();
        Arrays.sort(chArr);
        StringBuilder sb=new StringBuilder();
        for(char ch:chArr){
            if(s.indexOf(ch)==s.lastIndexOf(ch)){
                sb.append(ch);
            }
        }


        return sb.toString();
    }
}