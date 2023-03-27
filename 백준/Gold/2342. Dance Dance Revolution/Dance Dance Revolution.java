import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static char[] input;
    static int [][][] dp;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        input = br.readLine().replaceAll(" ","").toCharArray();
        int size = input.length-1;
        dp = new int[5][5][size];


        System.out.println(solve(0,0,0));
    }
    public static int solve(int l, int r,int idx){
        if(idx>=input.length-1)return 0;
        if(dp[l][r][idx]!=0)return dp[l][r][idx];
        dp[l][r][idx] = Math.min(solve(l,input[idx]-'0',idx+1)+cal(r,input[idx]-'0'),
                solve(input[idx]-'0',r,idx+1)+cal(l,input[idx]-'0'));
        return dp[l][r][idx];
    }
    public static int cal(int pos,int idx) {
        int abs = Math.abs(idx - pos);
        if (pos == 0) return 2;
        if (abs == 2) return 4;
        if (abs == 0) return 1;
        else return 3;
    }
}
/*





1 3 2 4 1 2 0
14
1 3 2 2 2 1 0
10
1 3 2 4 1 3 2 4 0
20
1 2 3 2 0
8
1 2 3 2 1 0
11
 */