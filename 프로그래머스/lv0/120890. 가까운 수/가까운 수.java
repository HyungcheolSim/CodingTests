class Solution {
    public int solution(int[] array, int n) {
        int min=100;
        for(int i:array){
            if(Math.abs(min-n)>Math.abs(i-n)){
                min=i;
            }else if(Math.abs(min-n)==Math.abs(i-n)){
                if(min>=i)
                    min=i;
            }
        }
        return min;
    }
}