import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [] dp=new int[N+1] , grape = new int[N+1];
        for (int i = 1; i <=N ; i++) {
            grape[i] = Integer.parseInt(br.readLine());
        }
        dp[0]=0;
        dp[1] = grape[1];
        if(N>=2) dp[2] =grape[1] +grape[2];
        for (int i = 3; i <=N ; i++) {
            dp[i] = Math.max(Math.max(dp[i-3]+grape[i-1],dp[i-2])+grape[i], dp[i-1]);
        }
        Arrays.sort(dp);
        System.out.println(dp[N]);
    }
}
/*

 */
