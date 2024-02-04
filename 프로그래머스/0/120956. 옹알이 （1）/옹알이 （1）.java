class Solution {
    public int solution(String[] babbling) {
        String[] words={"aya","ye","woo","ma"};
        int answer=0;
        
        for(String bab:babbling){
            for(String w:words){
                bab=bab.replaceAll(w," ");
            }
            if(bab.trim().equals(""))
                answer++;
        }
        return answer;
    }
}