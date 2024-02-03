import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int a=0,b=0;
        while(true){
            a=scan.nextInt();
            b= scan.nextInt();
            if(a==b&&b==0)
                break;
            //케이스 1: a가 b의 약수
            //케이스 2: a가 b의 배수
            //케이스 3: else
            if(a<=b&&b%a==0){
                System.out.println("factor");
            }else if(b<=a&&a%b==0){
                System.out.println("multiple");
            }else{
                System.out.println("neither");
            }
        }
    }
}