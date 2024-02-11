import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            boolean flag=true;
           String line = br.readLine();
           if(line.equals("0"))
                break;
            int len=line.length();
            for(int i=0;i<=len/2;i++){
                if(line.charAt(i)!=line.charAt(len-i-1)){
                    flag=false;
                }
            }
            if(flag) 
                System.out.println("yes");
            else 
                System.out.println("no");
        }
    }
}