import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int max, repeat;
    static int[][] dp = new int[101][100001];
    static int[][] bag;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        repeat = Integer.parseInt(st.nextToken());
        max = Integer.parseInt(st.nextToken());

        bag = new int[repeat+1][2];
        for (int i = 1; i <= repeat; i++) {
            st = new StringTokenizer(br.readLine()," ");
            bag[i][0]=Integer.parseInt(st.nextToken());
            bag[i][1]=Integer.parseInt(st.nextToken());

        }
        for (int i = 1; i <= repeat; i++) {
            for (int j = 1; j <= max; j++) {
                if(j -bag[i][0]>=0){
                    dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-bag[i][0]]+bag[i][1]);
                }else {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        System.out.println(dp[repeat][max]);

    }
}
