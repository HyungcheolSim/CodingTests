class Solution {
    public int solution(String my_string) {
        String[] str=my_string.replaceAll("[a-zA-Z]"," ").split(" ");
        int sum=0;
        for(String s:str){
            if(!s.equals("")){
                sum+=Integer.parseInt(s);
            }
        }
        return sum;
    }
}