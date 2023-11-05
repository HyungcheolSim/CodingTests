class Solution {
    public int solution(int[][] sizes) {
        int max = 0;
    
        for(int[] arr : sizes){
            max=Math.max(arr[0],max);
            max=Math.max(arr[1],max);
        }
    
        int num = 0;
        for(int[] arr:sizes){
            int temp = arr[0]>arr[1] ? arr[1] : arr[0];
            num = Math.max(temp, num);
        }
        return max*num;
    }
}