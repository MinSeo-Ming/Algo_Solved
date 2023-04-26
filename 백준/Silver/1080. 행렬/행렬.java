import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N ,M;
    static int [][]origin, result;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        origin = new int[N][M];
        result = new int[N][M];
        for (int i = 0; i < N; i++) {
            char []input = br.readLine().toCharArray();
            for (int j = 0; j < M; j++) {
                origin[i][j] = input[j]-'0';
            }
        }
        for (int i = 0; i < N; i++) {
            char []input = br.readLine().toCharArray();
            for (int j = 0; j < M; j++) {
                result[i][j] = input[j]-'0';
            }
        }
        int answer =0;

        for(int i = 0 ; i < N-2 ; i++){
            for(int j = 0 ; j < M-2 ; j++){
                if(origin[i][j] == result[i][j])
                    continue;

                answer++;
                for(int x = i; x < i+3; x++){
                    for(int y = j; y < j+3 ; y++){
                        origin[x][y] = origin[x][y] == 1? 0 : 1;
                    }
                }
            }
        }

        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < M ; j++){
                if(origin[i][j] != result[i][j]){
                    System.out.println(-1);
                    return;
                }
            }
        }

        System.out.println(answer);
    }
    static void move(int x,int y){
        for (int i = x; i < x+3; i++) {
            for (int j = y; j <y+ 3; j++) {
                origin[i][j] =(++origin[i][j])%2;
            }
        }
    }
}
