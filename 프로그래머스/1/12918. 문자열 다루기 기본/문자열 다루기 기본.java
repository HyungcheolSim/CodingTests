class Solution {
    public boolean solution(String s) {
        if(!(s.length()==4||s.length()==6)){
           return false; 
        }
        for(char ch:s.toCharArray()){
            if(ch>'9'||ch<'0'){
                return false;
            }
        }
        return true;
    }
}