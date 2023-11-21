class Solution {
    public String solution(String myString, String pat) {
        char post=pat.charAt(pat.length()-1);
        for(int i=myString.length()-1;i>0;i--){
            if(myString.charAt(i)==post){
                return myString.substring(0,i+1);
            }
        }
        return null;
    }
}