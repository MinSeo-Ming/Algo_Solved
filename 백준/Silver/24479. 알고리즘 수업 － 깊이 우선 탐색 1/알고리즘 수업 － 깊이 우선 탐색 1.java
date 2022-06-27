import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    static int N, E,R,index=1;
    static int []result;
    static boolean visited[];
    static ArrayList<Integer>[] list;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        list =new ArrayList[N+1];
        result = new int[N+1];
        visited = new boolean[N+1];
        for (int i = 0; i <= N; i++) {
            list[i]= new ArrayList<>();
        }
        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            list[start].add(end);
            list[end].add(start);
        }
        for (int i = 0; i <=N ; i++) {
            Collections.sort(list[i]);
        }
        dfs(R);
        for (int i = 1; i <=N ; i++) {
            System.out.println(result[i]);
        }
    }
    public static void dfs(int current){
        visited[current]=true;
        result[current]=index++;
        for (int i = 0; i < list[current].size(); i++) {
            int x = list[current].get(i);
            if(!visited[x])dfs(x);

        }
    }
}
