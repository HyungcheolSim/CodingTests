class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        for(int i=0;i<num_list.length;i++){
            int j=i/n;
            int k=i%n;
            answer[j][k]=num_list[i];
        }
        return answer;
    }
}