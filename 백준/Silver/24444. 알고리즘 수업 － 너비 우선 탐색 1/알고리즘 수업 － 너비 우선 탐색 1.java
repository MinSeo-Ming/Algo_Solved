import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N,M,R,u,v;
    static int [] arr ;
    static ArrayList<ArrayList<Integer>> list;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        arr = new int[N];
        list = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            list.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine()," ");
            u = Integer.parseInt(st.nextToken());
            v = Integer.parseInt(st.nextToken());
            list.get(u).add(v);
            list.get(v).add(u);
        }
        bfs(R);
        for (int num:arr) {
            System.out.println(num);
        }
    }
    public static void bfs(int start){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        int index=1;
        arr[(start-1)] =index;
        while (!queue.isEmpty()){
            int out = queue.poll();
            ArrayList<Integer>get =list.get(out);
            Collections.sort(get);
            for (int num : get) {
                if(arr[(num-1)]==0){
                    queue.add(num);
                    arr[(num-1)]=++index;
                }
            }

        }
    }
}
