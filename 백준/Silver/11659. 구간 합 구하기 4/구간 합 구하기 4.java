import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int repeat = Integer.parseInt(st.nextToken());
        int arr[] = new int[N];
        int sum[] = new int[N+1];
        int idx =0;
        st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sum[i+1] = arr[i] +sum[i];
        }
        for (int i = 0; i < repeat; i++) {
            st = new StringTokenizer(br.readLine()," ");
            int first  =Integer.parseInt(st.nextToken());
            int end  =Integer.parseInt(st.nextToken());
            System.out.println(sum[end]-sum[first-1]);

        }
    }
}
