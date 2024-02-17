import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int size = str.length();
        int maxLen=size%2==0 ? size/2 : size/2+1;
        int result = 1;
        for(int i=0;i<maxLen;i++){
            if(str.charAt(i)!=str.charAt(size-i-1)){
                result = 0;
                break;
            }
        }
        System.out.println(result);
    }
}