import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int N,MOD = 9901;
    static int[][] dp = new int[100001][3];
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        Arrays.fill(dp[1],1);
        for (int i = 2; i <=N ; i++) {
            dp[i][0] = (dp[i-1][0]+ dp[i-1][1]+dp[i-1][2])%MOD;
            dp[i][1] = (dp[i-1][0]+dp[i-1][2])%MOD;
            dp[i][2] = (dp[i-1][0]+ dp[i-1][1])%MOD;
        }
        System.out.println((dp[N][0]+dp[N][1]+dp[N][2])%MOD);
    }
}
