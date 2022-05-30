import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        long []arr = new long[M];
        long []sum = new long[N];
        long result =0;
        int idx =0;
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()){
            if(idx ==0){
                sum[idx++] = Long.parseLong(st.nextToken());
            }else{
                sum[idx] =sum[idx-1] +Long.parseLong(st.nextToken());
                idx++;
            }
        }
        for (int i = 0; i < N; i++) {
            int remainder = (int)(sum[i]%M);
            if(remainder ==0) result++;
            arr[remainder]++;
        }
        for (int i = 0; i < M; i++) {
            if(arr[i]>1){
                result = result +(arr[i]*(arr[i]-1)/2);
            }
        }
        System.out.println(result);
    }
}
