import java.util.*;
public class Main{
     public static void main(String[] args){
         Scanner scan = new Scanner(System.in);
         int N=scan.nextInt();
         int order=scan.nextInt();
         List<Integer> answer = new ArrayList();
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