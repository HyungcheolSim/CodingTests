import java.util.Scanner;
public class Main{
    public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
        //int k,q,l,v,k,p;
        //k=1,q=1,l=2,v=2,k=2,p=8;
        int[] arr={1,1,2,2,2,8};
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            int num=scan.nextInt();
            sb.append(arr[i]-num+" ");
        }
        System.out.println(sb.toString());
    }
}
