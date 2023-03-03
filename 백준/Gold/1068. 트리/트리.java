import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static int N,root,drop,cnt =0;
    static boolean[] visited;
    static ArrayList<ArrayList<Integer>>list;
    public static void main(String[] args)throws Exception {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(new ArrayList<>());
        }
        visited = new boolean[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int input = Integer.parseInt(st.nextToken());
            if(input==-1) root =i;
            else{
                list.get(input).add(i);
            }
        }
        drop = Integer.parseInt(br.readLine());
        br.close();
        dfs(root);
        System.out.println(cnt);
    }
    static void dfs(int index){
        if(index!=drop) {
            visited[index] = true;
            ArrayList<Integer> get = list.get(index);
            int size = get.size();
            if (size == 0) {
                cnt++;
                return;
            } else {
                for (int a : get) {
                    if (!visited[a] && a != drop) {
                        dfs(a);
                    }
                    if(a ==drop){
                        size --;
                    }
                }
            }
            if(size ==0)cnt++;
        }
    }
}