import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N,M;
    static ArrayList<ArrayList<Integer>> party = new ArrayList<>(),people =new ArrayList<>();
    static HashSet<Integer> truth = new HashSet<>();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for (int i = 0; i <= N; i++) {
            people.add(new ArrayList<>());
        }
        st = new StringTokenizer(br.readLine());
        if(Integer.parseInt(st.nextToken())!=0){
            while(st.hasMoreTokens()){
                truth.add(Integer.parseInt(st.nextToken()));
            }
        }

        while (M-->0){
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            ArrayList<Integer> list = new ArrayList<>();
            int pre =0,now=0;
            while(st.hasMoreTokens()){
                now = Integer.parseInt(st.nextToken());
                if(pre!=0) {
                    people.get(pre).add(now);
                    people.get(now).add(pre);
                }
                pre = now;
                list.add(now);
            }
            party.add(list);
        }

        for (int i = 1; i <= N ; i++) {
            if(truth.contains(i)){
                bfs(i);
            }
        }
        int count =0;
        boolean flag = false;
        for (ArrayList<Integer> p: party) {
            flag =false;
            for (int i = 0; i < p.size(); i++) {
                if(truth.contains(p.get(i))){
                    flag =true;
                    continue;
                }
            }
            if(!flag) count++;
        }

        System.out.println(count);


    }
    public static void bfs(int idx){

        boolean visited [] = new boolean[N+1];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(idx);
        visited[idx]=true;
        while(!queue.isEmpty()){
            idx = queue.poll();
            ArrayList<Integer> list = people.get(idx);
            for (int i = 0; i < list.size(); i++) {
                int get = list.get(i);
                if(visited[get])continue;
                visited[get]=true;
                truth.add(get);
                queue.add(get);
            }

        }
    }
}
