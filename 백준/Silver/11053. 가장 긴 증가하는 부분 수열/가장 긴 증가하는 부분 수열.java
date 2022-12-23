import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N,MAX=Integer.MIN_VALUE;
    static int [] array, dp;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        int [] array = new int[N];
        int [] dp = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for(int i = 0; i < N; i++) {
          array[i]= Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            dp[i]=1;
            for(int j=0; j<i; j++) {
                if (array[i] > array[j] && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                }
            }

            if (MAX < dp[i]) {
                MAX = dp[i];
            }
        }

        System.out.println(MAX);

    }
}
