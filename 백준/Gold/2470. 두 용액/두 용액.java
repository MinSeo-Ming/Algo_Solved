import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int arr[] = new int[N];
        int idx =0,lt=0,rt=N-1;
        while (st.hasMoreTokens()){
            arr[idx++]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int num_1=0, num_2=0,gap =Integer.MAX_VALUE,sum=0;
        while (lt<rt){
            sum = arr[lt]+arr[rt];
            if(Math.abs(sum)<gap){
                gap = Math.abs(sum);
                num_1 = arr[lt];
                num_2 = arr[rt];
            }
            if(sum<0){
                lt++;
            }
            else{
                rt--;
            }
        }
        System.out.println(num_1+ " "+num_2);
    }
}
