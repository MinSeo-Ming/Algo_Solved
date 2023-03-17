import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N,MAX = Integer.MIN_VALUE,idx;
    static int[] arr,dp;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        dp = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int index = 0;
        while (st.hasMoreTokens()){
            arr[index++] = Integer.parseInt(st.nextToken());
        }
        dp[0]=arr[0];
        for (int i = 1; i < N; i++) {
            dp[i]=arr[i];
            for (int j = 0; j <i ; j++) {
                if(arr[i] >arr[j]){
                    dp[i] = Math.max(dp[i],dp[j]+arr[i]);
                }
            }
        }

        Arrays.sort(dp);
        System.out.println(dp[N-1]);
    }

}
