import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N,M;
    static int [][]dp,map;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        dp = new int[N+1][M+1];
        map = new int[N+1][M+1];
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= M; j++) {
                map[i][j] =Integer.parseInt(st.nextToken());

            }
        }
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <=M ; j++) {
                int temp =Math.max(dp[i-1][j],dp[i][j-1]);
                dp[i][j] =Math.max(temp,dp[i-1][j-1])+map[i][j];
            }
        }
        System.out.println(dp[N][M]);
    }
}
