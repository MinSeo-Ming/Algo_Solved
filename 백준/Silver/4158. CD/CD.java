import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N,M;
    static int[] sang,  sun;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        while (true) {
            st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            if(N==0 && M==0)break;

            sang = new int[N];
            sun = new int[M];
            for (int i = 0; i < N; i++) {
                sang[i] = Integer.parseInt(br.readLine());
            }

            for (int i = 0; i < M; i++) {
                sun[i] = Integer.parseInt(br.readLine());
            }
//            String end =br.readLine();

            int same = 0;
            int lt = 0, rt = 0;
            while (lt < M && rt < N) {
                if (sang[rt] == sun[lt]) {
                    same++;
                    rt++;
                    lt++;
                } else if (sang[rt] < sun[lt]) {
                    rt++;
                } else {
                    lt++;
                }
            }
            System.out.println(same);
        }
    }

}
/*
1 1
1
2
2 2
3
4
3
4
0 0
 */