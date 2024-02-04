class Solution {
    public String[] solution(String my_str, int n){
        int len=my_str.length()%n==0?my_str.length()/n:my_str.length()/n+1;
        if(len==1)
            return new String[] {my_str};
        String[] answer= new String[len];
        for(int i=0;i<len;i++){
            answer[i]=my_str.substring(i*n,(i+1)*n>my_str.length()?my_str.length():(i+1)*n);
        }
        return answer;
    }
}