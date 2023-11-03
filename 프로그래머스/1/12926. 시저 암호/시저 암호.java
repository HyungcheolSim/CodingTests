class Solution {
    public String solution(String s, int n) {
        StringBuilder sb=new StringBuilder();
        
        for(char ch:s.toCharArray()){
            if(ch!=' '){
                char newChar=(char)(((ch>='a'&&ch<='z')&&n+ch>'z'||(ch>='A'&&ch<='Z')&&n+ch>'Z')?n+ch-26:n+ch);
                sb.append(newChar);
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}