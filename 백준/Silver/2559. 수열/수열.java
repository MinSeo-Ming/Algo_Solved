import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
        static int N, K;
        static int[] arr;
        public static void main(String[] args) throws Exception{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                N = Integer.parseInt(st.nextToken());
                K = Integer.parseInt(st.nextToken());

                st = new StringTokenizer(br.readLine(), " ");
                arr = new int[N];
                int i =0;

                while (st.hasMoreTokens()){
                        arr[i++] = Integer.parseInt(st.nextToken());
                }

                int lt=0, rt=K;
                int max = Integer.MAX_VALUE;
                int sum =0;
                for(i=0; i<K; i++){
                        sum += arr[i];
                }
                max = sum;
                while (rt<N){
                        sum -= arr[lt++];
                        sum += arr[rt++];
                        if(sum>max)
                                max =sum;

                }
                System.out.println(max);
        }
}
