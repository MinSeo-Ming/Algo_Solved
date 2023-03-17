import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static int [] dp, stair;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        dp = new int[N+1];
        stair = new int[N+1];
        for (int i = 1; i <= N; i++) {
            stair[i] = Integer.parseInt(br.readLine());
        }
        dp[1] = stair[1];
        if(N >=2){
            dp[2]=stair[1]+stair[2];
        }
        for (int i = 3; i <= N; i++) {
            dp[i] = Math.max(dp[i-3]+stair[i-1], dp[i-2])+stair[i];

        }
        System.out.println(dp[N]);
    }
}
