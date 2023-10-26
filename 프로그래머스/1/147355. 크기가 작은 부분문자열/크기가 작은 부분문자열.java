class Solution {
    public long solution(String t, String p) {
        long size=t.length()- p.length()+1;
        //p보다 t가 작거나 같을 때 count++;
        long target=Long.parseLong(p);
        long answer = 0;
        
        for(int i=0;i<=t.length()-p.length();i++){
            long num=Long.parseLong(t.substring(i,i+p.length()));
            if(num<=target)
                answer++;
        }
        return answer;
    }
}