class Solution {
    public int solution(int[] num_list) {
        int os=0;//홀수
        int es=0;//짝수
        for(int i=0;i<num_list.length;i++){
            if(i%2==0)
                es+=num_list[i];
            else
                os+=num_list[i];
        }
        return Math.max(os,es);
    }
}