class Solution {
    public int solution(String s) {
        if(s.indexOf(0)=='+'){
            s=s.replace("+","");
            return Integer.valueOf(s);
        }else if(s.indexOf(0)=='-'){
            s=s.replace("-","");
            return 0-Integer.valueOf(s);
        }else
            return Integer.valueOf(s);
    }
}