import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int num,price;
    static int[] coin,ans;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        num = Integer.parseInt(st.nextToken());
        price = Integer.parseInt(st.nextToken());

        coin = new int[num];
        for (int i = 0; i < num; i++) {
            coin[i]= Integer.parseInt(br.readLine());
        }
        Arrays.sort(coin);

        ans = new int[price+1];

        for (int i = 1; i <=price ; i++) {
            ans[i] =Integer.MAX_VALUE-1;
        }
        ans[0] =0;

        for (int i = 0; i < num; i++) {
            for (int j = coin[i]; j <= price ; j++) {
                ans[j] = Math.min(ans[j], ans[j - coin[i]] + 1);
            }
        }

        System.out.println(ans[price] ==(Integer.MAX_VALUE-1)? -1:ans[price]);
    }

}