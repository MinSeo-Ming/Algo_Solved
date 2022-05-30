import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long arr[] = new long[N];
        int idx =0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()){
            arr[idx++] =Long.parseLong(st.nextToken());
        }

        Arrays.sort(arr);
        int count =0, sum=0, target=0;
        for (int i = 0; i < N; i++) {
            long find = arr[i];
            int lt =0, rt = N-1;
            while (lt<rt){
                if(arr[lt]+arr[rt] ==find){
                    if(lt!=i && rt!=i){
                        count++;
                        break;
                    }else if(i==lt){
                        lt++;
                    }else if(i==rt){
                        rt--;
                    }
                }else if(arr[lt]+arr[rt] <find){
                    lt++;
                }else rt--;
            }
        }
        System.out.println(count);
    }
}

