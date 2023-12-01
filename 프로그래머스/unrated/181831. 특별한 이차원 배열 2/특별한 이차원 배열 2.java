class Solution {
    public int solution(int[][] arr) {
        //n*n 배열 arr이 
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]!=arr[j][i])
                    return 0;
            }
        }
        return 1;
    }
}