class Solution {
    public String solution(String s) {
//        return s.substring((s.length()-1)/2, s.length()/2 + 1);
        StringBuilder sb=new StringBuilder();
        if(s.length()%2==0){
            sb.append(s.charAt(s.length()/2-1));    
        }
        sb.append(s.charAt(s.length()/2));
        
        return sb.toString();
    }
}