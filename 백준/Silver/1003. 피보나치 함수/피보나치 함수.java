import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    static int num0 = 0;
    static int num1 = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < T; i++){
            fibonacci(Integer.parseInt(br.readLine()));
            System.out.println(num0+ " "+num1);
            num0=0;
            num1=0;
        }
    }

     public static void fibonacci(int n){
         		
		int temp1 = 0;
		int temp2 = 1;
		int temp = 0;
         
         if (n == 0) {
            num0++;
            return;
         } else if (n == 1) {
            num1++;
            return;
         } else if(n < 0) return;
         else{
             for( int i=1;i<n;i++){
                 temp = temp1+temp2;
                 temp1= temp2;
                 temp2=temp;
             }
             num0=temp1;
             num1=temp2;
         }
     }
}

        
        