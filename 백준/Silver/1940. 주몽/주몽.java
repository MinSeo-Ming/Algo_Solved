import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int idx =0;
        while (st.hasMoreTokens()){
            arr[idx++] =Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        
        int lt =0, rt = N-1;
        int result =0;
        int sum;
        while (lt<rt){
            sum =arr[lt]+arr[rt];
            if(sum==M){
                result++;
                lt ++; rt--;
            }else if(sum<M){
                lt++;
            }else{
                rt--;
            }
        }
        System.out.println(result);
    }
}
