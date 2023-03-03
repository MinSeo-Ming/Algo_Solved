
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static int[] depth,parent;
    static int N,M;
    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        visited = new boolean[N+1];
        depth = new int[N+1];
        parent = new int[N+1];
        for (int i = 0; i <= N; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < N-1; i++) {
            st = new StringTokenizer(br.readLine()," ");
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            list.get(s).add(e);
            list.get(e).add(s);
        }
        dfs(1,1);
        M = Integer.parseInt(br.readLine());
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine()," ");
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            System.out.println(LCA(s,e));
        }
        br.close();
    }
    static void  dfs(int idx,int d){
        visited[idx]=true;
        ArrayList<Integer> get = list.get(idx);
        for(int a : get){
            if(!visited[a]){
                parent[a]=idx;
                depth[a]=d;
                dfs(a,d+1);
            }
        }
    }
    static int LCA(int st, int ed){
        if(depth[st]< depth[ed]){
            int temp = st;
            st = ed;
            ed = temp;
        }
        while(depth[st]!=depth[ed]){
            st = parent[st];
        }
        while(st!= ed){
            st = parent[st];
            ed = parent[ed];
        }
        return st;
    }
}
