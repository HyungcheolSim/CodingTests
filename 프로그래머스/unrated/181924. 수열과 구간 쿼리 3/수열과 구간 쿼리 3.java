class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int[] k:queries){
            int temp=arr[k[0]];
            arr[k[0]]=arr[k[1]];
            arr[k[1]]=temp;
        }
        return arr;
    }
}