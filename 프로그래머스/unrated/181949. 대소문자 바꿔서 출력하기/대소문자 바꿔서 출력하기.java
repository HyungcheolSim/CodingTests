import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder sb=new StringBuilder();
        char[] arr=a.toCharArray();
        for(char ch:arr){
            sb.append(ch>='a'&&ch<='z'?Character.toUpperCase(ch):Character.toLowerCase(ch)); 
        }
        System.out.print(sb.toString());
    }
}