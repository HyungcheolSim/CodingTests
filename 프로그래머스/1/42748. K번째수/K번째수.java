import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        //쉘 정렬 https://st-lab.tistory.com/209
        int[] answer=new int[commands.length];
        
        for(int h=0;h<commands.length;h++){
            int[] tempArr=new int[commands[h][1]-commands[h][0]+1];
            int tIdx=0;
            for(int i=commands[h][0]-1;i<commands[h][1];i++){
                tempArr[tIdx]=array[i]; //1~4
                tIdx++;
            }
            shell_sort(tempArr,tempArr.length);
            answer[h]=tempArr[commands[h][2]-1];
        }
        return answer;
    }
    private final static int[] gap = 
		{ 1, 4, 10, 23, 57, 132, 301, 701, 1750};

	private static int getGap(int length) {
		int index = 0;
		int len = (int)(length / 2.25);	
		while (gap[index] < len) {
			index++;
		}
		return index;
	}
    private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
    }
    private static void shell_sort(int[] a, int size) {
		int gapIndex = getGap(size);
		while(gapIndex >= 0) {
			int step = gap[gapIndex--];
			for(int i = step; i < size; i++) {
				for (int j = i; j >= step && a[j] < a[j - step]; j -= step) {
					swap(a, j, j - step);
				}
			}
		}
	}
}