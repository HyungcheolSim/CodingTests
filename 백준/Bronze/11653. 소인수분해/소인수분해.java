import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int i=2;
        while(num>1){
            if(num%i==0){
                num/=i;
                System.out.printf("%d\n",i);
            }else{
                i++;
            }
        }
    }
}