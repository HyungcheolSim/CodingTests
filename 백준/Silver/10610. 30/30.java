import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br;

    public static String str;
    public static int[] numCountArr;
    public static long strLen;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        str = br.readLine();
        strLen = str.length();

        numCountArr = new int[10]; //각 숫자 별 나타난 횟수 저장
        long total = 0; //모든 자리수의 합이 3의 배수면 30의 배수다
        for (int i = 0; i < strLen; i++) {
            int tNum = Integer.parseInt(str.substring(i, i + 1));
            //int tNum = str.charAt(i)-'0';
            numCountArr[tNum] += 1;
            total += tNum;
        }

        if (!str.contains("0") || total % 3 != 0) {
            System.out.println("-1");
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            while (numCountArr[i] > 0) {
                sb.append(i);
                numCountArr[i]--;
            }
        }
        System.out.println(sb);
    }
}
