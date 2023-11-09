class Solution {
    public String solution(int[] numLog) {
        int answer=numLog[0];
        StringBuilder sb =new StringBuilder();
        for(int i=1;i<numLog.length;i++){
            if(numLog[i]-answer==1){
                answer+=1;
                sb.append("w");
            }else if(numLog[i]-answer==-1){
                answer-=1;
                sb.append("s");
            }else if(numLog[i]-answer==10){
                answer+=10;
                sb.append("d");
            }else if(numLog[i]-answer==-10){
                answer-=10;
                sb.append("a");
            }
        }
        return sb.toString();
    }
}