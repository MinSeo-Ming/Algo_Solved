import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N,M;
    static int[] origin, find, result;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        origin = new int[N];
        int idx =0;
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        while (st.hasMoreTokens()){
            origin[idx++]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(origin);

        M = Integer.parseInt(br.readLine());
        find= new int[M];
        idx=0;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine()," ");
        while (st.hasMoreTokens()){
            find[idx++]=Integer.parseInt(st.nextToken());
        }
        br.close();

        for (int i = 0; i < M; i++) {
            sb.append(upperBinary(find[i])-lowBinary(find[i])).append(" ");
        }

        System.out.println(sb.toString());

    }
    static int lowBinary(int key){
        int low_idx = 0;
        int high_idx = N;
        int mid_idx;

        while (low_idx<high_idx){
            mid_idx = (low_idx +high_idx)/2;
            if(key<=origin[mid_idx]){
                high_idx= mid_idx;
            }else {
                low_idx = mid_idx+1;
            }
        }
        return low_idx;
    }
    static int upperBinary(int key){
        int low_idx = 0;
        int high_idx = N;
        int mid_idx;

        while (low_idx<high_idx){
            mid_idx = (low_idx +high_idx)/2;
            if(key<origin[mid_idx]){
                high_idx= mid_idx;
            }else {
                low_idx = mid_idx+1;
            }
        }
        return low_idx;
    }
}
