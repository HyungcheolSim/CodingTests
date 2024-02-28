import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String strN = br.readLine();
        //수의 범위: 0~9 , 반복횟수: 문자열의 길이
        int[] nums = new int[10];
        for(int i=0;i<strN.length();i++){
            nums[strN.charAt(i)-'0']++;
        }
        br.close();
        
        for(int i=9;i>=0;i--){
            while (nums[i]-- > 0) {
				System.out.print(i);
			}
        }
    }
}