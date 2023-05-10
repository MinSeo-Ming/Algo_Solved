import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static int N ;
    static int []  dp;
    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        dp = new int[N+1];
        int [] d = {0,1,2,3,4,5,1,2,3,4,5,6,2};
        if(N<13) System.out.println(d[N]);
        else{
            for (int i = 0; i < d.length; i++) {
                dp[i]= d[i];
            }
            getNum();
            for (int i = 13; i <= N; i++) {
                int min = Integer.MAX_VALUE;
                for (int num:list) {
                    if(num > i) break;
                    min = Math.min(min,dp[i-num]);
                }
                dp[i]= min+1;
            }
            System.out.println(dp[N]);
        }

    }
    static void getNum(){
        for (int i = 1; i <=N ; i++) {
            list.add(i*i*2-i);
        }
    }

}
