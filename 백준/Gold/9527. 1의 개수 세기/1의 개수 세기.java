import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static long start,ed;
    static long[] sum = new long[56];
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        start = Long.parseLong(st.nextToken());
        ed = Long.parseLong(st.nextToken());
        sum[0] = 1;
        for (int i = 1; i <= 55; i++) {
            sum[i] = sum[i - 1] *2 +((long) 1<<i);
            // 1의 갯수의 총합이기 때문에 이전거 *2 + 늘어난 갯수만큼 그걸 shift 연산함
        }

        System.out.println(cal(ed)-cal(start-1));
    }
    public static long cal(long idx){
        long result = idx & 1;
        int log = (int)(Math.log(idx)/Math.log(2));

        for (int i = log; i >0 ; i--) {
            if((idx &((long )1<<i)) != 0){
                result += sum[i-1] + (idx - (1L << i) +1);
                idx -= (1L <<i); 
            }
        }
        
        return result;

    }

}
