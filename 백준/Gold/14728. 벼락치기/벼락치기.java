import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N,T;
    static int[][] dp;
    static int[][] info;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        T = Integer.parseInt(st.nextToken());
        dp = new int[N+1][T+1];
        info = new int[N+1][2];
        for (int i = 1; i <= N ; i++) {
            st = new StringTokenizer(br.readLine());
            int time = Integer.parseInt(st.nextToken());
            int score = Integer.parseInt(st.nextToken());
            info[i][0]=time;
            info[i][1]=score;
        }

        for (int i = 1; i <=N ; i++) {
            for (int j = 1; j <=T ; j++) {
                if(info[i][0]<=j) {
                    dp[i][j] = Math.max(dp[i-1][j-info[i][0]]+info[i][1] ,dp[i-1][j]);
                }else{
                    dp[i][j]= dp[i-1][j];
                }
            }
        }
        System.out.println(dp[N][T]);
    }
}
