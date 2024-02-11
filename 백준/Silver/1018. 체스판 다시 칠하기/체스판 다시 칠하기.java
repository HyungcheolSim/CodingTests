import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

//M * N 크기 보드
//검은색과 흰색으로 구분된 판을 잘라 8 * 8 체스판으로 만드는 목적
//
// 첫 줄에 M, N
//둘째 줄부터 줄의 색칠상태
// 8*8을 체크하는 메서드(흰색시작 와 검정시작)
public class Main{
    public static void main(String[] args) throws Exception {
        //입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lines = br.readLine().split(" ");
        int N = Integer.parseInt(lines[0]);
        int M = Integer.parseInt(lines[1]);
       
        // 보드 색칠현황 배열에 저장
        String[][] board = new String[N][M];
        for(int i=0;i<N;i++){
            String[] input = br.readLine().split("");
            for(int j=0;j<M;j++){
                board[i][j]=input[j];
            }
        }
        
        br.close();
        
        //참조 정답 배열 생성
        String[][] refB = createRefArr("B");
        String[][] refW = createRefArr("W");
        
        int answer= Integer.MAX_VALUE; // 정답 받을 변수
        
        // 입력받은 배열을 조회하며 최소 색칠 개수 출력
        for(int i=0;i<=N-8;i++){
            for(int j=0;j<=M-8;j++){
                int diffB = checkDiff(i,j,board,refB);
                int diffW = checkDiff(i,j,board,refW);
                int min = diffB >= diffW ? diffW : diffB;
                if(min<answer)
                    answer=min;
            }
        }
        //출력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        bw.write(answer+"");
        bw.close();
    }
    //검정으로 시작하는 배열과 비교해서 차이점 카운트 리턴
    public static int checkDiff(int x,int y,String[][] board,String[][] arr2){
        int count=0;
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(!board[i+x][j+y].equals(arr2[i][j]))
                    count++;
            }
        }
        return count;
    }
    //정답 배열 생성 메서드
    public static String[][] createRefArr(String color){
        String[][] ref=new String[8][8];
        String other=color.equals("B")?"W":"B";

        for(int x=0;x<8;x++){
            for(int y=0;y<8;y++){
                if(x%2==0){
                    if(y%2==0){ 
                        ref[x][y]=color;        
                    }else{
                        ref[x][y]=other;
                    }
                }else{
                    if(y%2==0){ 
                        ref[x][y]=other;        
                    }else{
                        ref[x][y]=color;
                    }
                }                
            }
        }
        return ref;
    }
}