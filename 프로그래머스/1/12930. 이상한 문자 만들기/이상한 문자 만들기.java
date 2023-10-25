class Solution {
    public String solution(String s) {
        int cur=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)+"".equals(" ")){
                cur=0;
                continue;
            }                
            if(cur%2==0)
                s[i]=s.charAt(i)+32;
            cur++;
            
        }
    }
}