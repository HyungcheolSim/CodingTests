class Solution {
    public int solution(int[] num_list) {
        int len=num_list.length;
        int answer=0;
        if(len>=11){
            for(int i:num_list){
                answer+=i;
            }
        }else{
            for(int i:num_list){
                if(answer==0)
                    answer=1;
                answer*=i;
            }
        }
        return answer;
    }
}