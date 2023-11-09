class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int index=-1;
        for(int[]k:queries){
            for(int i=k[0];i<=k[1];i++){
                if(i%k[2]==0)
                    arr[i]++;
            }
        }
        return arr;
    }
}