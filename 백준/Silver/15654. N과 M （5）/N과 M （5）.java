import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N,M;
    static int[] arr,input;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        input = new int[N];
        arr = new int[M];
        boolean [] visited = new boolean[N];
        int idx=0;
        st = new StringTokenizer(br.readLine()," ");
        while (st.hasMoreTokens()){
            input[idx++]= Integer.parseInt(st.nextToken());
        }
        Arrays.sort(input);
        permutation(0,visited);
    }
    public static void permutation( int cnt,boolean visited[]){
        if(cnt==M){
            for (int i = 0; i < M; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            return;
        }
        for (int i = 0; i < N; i++) {
            if(!visited[i]) {
                visited[i]=true;
                arr[cnt] = input[i];
                permutation(cnt+1, visited);
                visited[i]=false;
            }
        }
    }


}
