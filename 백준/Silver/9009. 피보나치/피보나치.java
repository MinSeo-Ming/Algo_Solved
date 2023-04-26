import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static int N;
    static int[] memo = new int[46];
    public static void main(String[] args)  throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        memo[0] =0;
        memo[1] =1;
        N = Integer.parseInt(br.readLine());
        for (int i = 2; i <=45 ; i++) {
            memo[i]= memo[i-1]+memo[i-2];
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            int get = Integer.parseInt(br.readLine());
            int sum = 0;
            int result = get;
            for (int j = 45; j >=0 ; j--) {
                if(memo[j]<=get){
                    get -=memo[j];
                    list.add(memo[j]);
                }
                if(get==0) {
                    Collections.sort(list);
                    for (int num:list) {
                        sb.append(num).append(" ");
                    }
                    sb.append("\n");
                    break;
                }

            }

        }
        System.out.print(sb.toString());
    }
}
