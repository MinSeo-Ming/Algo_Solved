import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int arr[] = new int[N+1];
        int sum[] = new int[N+1];

        for (int i = 1; i <= N; i++) {
            arr[i] =Integer.parseInt(st.nextToken());
            sum[i]=sum[i-1]+arr[i];
        }


        int repeat = Integer.parseInt(br.readLine());
        while (repeat-->0){
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            System.out.println(sum[end]-sum[start-1]);
        }
    }
}
