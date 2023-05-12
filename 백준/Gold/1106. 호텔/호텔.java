import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int C,N,LIMIT =100001;
    static int[] dp;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());
        C = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        int idx=0,val=0;
        dp = new int[C+101];
        Arrays.fill(dp, 987654321);
        dp[0]=0;
        for (int i = 0; i < N; i++) {
            st =new StringTokenizer(br.readLine());
            idx = Integer.parseInt(st.nextToken());
            val = Integer.parseInt(st.nextToken());
            for (int j = val; j <C+101 ; j++) {
                dp[j] = Math.min(dp[j],idx+dp[j-val]);
            }
        }
        int result = Integer.MAX_VALUE;
        for (int i = C; i <C+101 ; i++) {
            result=Math.min(result,dp[i]);
        }
        //System.out.println(Arrays.toString(dp));
        System.out.println(result);



    }

}
/*
1000 1
100 1
5 3
1 5
6 5
2 1
 */