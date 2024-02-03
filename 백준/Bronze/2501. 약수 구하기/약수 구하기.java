import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums=br.readLine().split(" ");
        int N = Integer.parseInt(nums[0]);
        int order = Integer.parseInt(nums[1]);
        ArrayList<Integer> answer = new ArrayList();
        for(int i=1;i<=Math.sqrt(N);i++){
             if(N%i==0){
                 answer.add(i);
                 if(i!=N/i){
                     answer.add(N/i);
                 }
             }
         }
         Collections.sort(answer);
         if(order>answer.size())
             System.out.println(0);
         else{
             System.out.println(answer.get(order-1));    
         }
     }   
}