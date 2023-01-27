
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),"-");
        int idx =0;
        int min =0;
        StringTokenizer plus ;
        while (st.hasMoreTokens()){
            int minus =0;
            plus = new StringTokenizer(st.nextToken(),"+");

            if(idx==0){
                while (plus.hasMoreTokens()){
                    min += Integer.parseInt(plus.nextToken());
                }

            }else {
                while (plus.hasMoreTokens()){
                    minus += Integer.parseInt(plus.nextToken());
                }
                min -= minus;
            }
            idx++;
        }
        System.out.println(min);
    }
}
