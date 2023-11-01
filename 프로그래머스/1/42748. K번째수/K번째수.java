import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        //알고리즘 사용 안한 풀이
        int[] answer=new int[commands.length];
        
        for(int h=0;h<commands.length;h++){
            int[] tempArr=new int[commands[h][1]-commands[h][0]+1];
            int tIdx=0;
            for(int i=commands[h][0]-1;i<commands[h][1];i++){
                tempArr[tIdx]=array[i]; //1~4
                tIdx++;
            }
            Arrays.sort(tempArr);
            answer[h]=tempArr[commands[h][2]-1];
        }
        return answer;
    }
}