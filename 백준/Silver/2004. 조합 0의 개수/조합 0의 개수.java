import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int sum_5 = num_five(N) -num_five(M)- num_five(N-M);
        

        int sum_2 = num_two(N)-num_two(M)-num_two(N-M);
      

        int sum = Math.min(sum_2,sum_5);
        System.out.println(sum);
    }

    static int  num_five(int n){
        int sum =0;

        while (n>=5){
            sum += n/5;
            n/=5;
        }
        return sum;
    }
    static int  num_two(int n){
        int sum =0;

        while (n>=2){
            sum += n/2;
            n/=2;
        }
        return sum;
    }
}
