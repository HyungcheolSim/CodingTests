class Solution {
    public String solution(String s) {
        //첫 문자가 항상 대문자, 숫자일 경우 스킵
        int idx=0;
        String answer="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==' '){
                idx=-1;
            }
            answer+=ch<='9'&&ch>='0'?ch:idx==0?Character.toUpperCase(ch):Character.toLowerCase(ch);
            idx++;
        }
        return answer;
    }
}