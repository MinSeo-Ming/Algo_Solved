import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    static int count, repeat,max;
    static int[] coin,dp;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        repeat = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int tc = 0; tc < repeat; tc++) {


            count = Integer.parseInt(br.readLine());
            coin = new int[21];
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            for (int i = 1; st.hasMoreTokens(); i++) {
                coin[i]=Integer.parseInt(st.nextToken());
            }
            max = Integer.parseInt(br.readLine());

            dp= new int[10001];
            dp[0]=1;
            for (int i = 1; i <= count; i++) {
                for (int j = coin[i]; j<=max; j++){
                    dp[j] +=dp[j-coin[i]];
                }
            }
//            System.out.println(dp[max]);
            sb.append(dp[max]).append("\n");
        }
        br.close();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
