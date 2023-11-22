class Solution {
    public int solution(String myString, String pat) {
        String[] answer=new String[myString.length()];
        for(int i=0;i<myString.length();i++){
            if(myString.charAt(i)=='A'){
                answer[i]='B'+"";
            }else{
                answer[i]='A'+"";
            }
        }
        myString=String.join("",answer);
        return myString.contains(pat)?1:0;
    }
}