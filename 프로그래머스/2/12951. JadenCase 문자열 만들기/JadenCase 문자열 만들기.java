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
            //숫자일 경우
                if(ch<='9'&&ch>='0') answer+=ch;
                //숫자가 아닌데 첫 인덱스라 대문자로 바꿔야 할 경우
                else if(idx==0){
                answer+=Character.toUpperCase(ch);
                }else{ //
                    answer+=Character.toLowerCase(ch);
                }
            idx++;
        }
        return answer;
    }
}