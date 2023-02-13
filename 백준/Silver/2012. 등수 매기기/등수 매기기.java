import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int[]arr;
    static int N;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        long sum =0;
        for (int i = 0; i <N ; i++) {
            arr[i] = Integer.parseInt(br.readLine());

        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            sum+= Math.abs(arr[i]-(i+1));
        }
        System.out.println(sum);

    }
}
/*
4
1
1
4
4
 */