import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int F,S,G,U,D;
    static Queue<Integer>queue;
    static boolean []visited;
    static int count =0;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        F = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        G = Integer.parseInt(st.nextToken());
        U = Integer.parseInt(st.nextToken());
        D = Integer.parseInt(st.nextToken());
        visited = new boolean[F+1];
        bfs();
    }
    public static void bfs(){
        queue = new LinkedList<>();
        queue.add(S);
        while (!queue.isEmpty()){
            int now = queue.poll();
            if(now==G){
                System.out.println(count);
                return;
            }
            visited[now] =true;
            if(now<G||now-D <=0){
                int up = now + U;
                int down = now - D;
                if(up<=F&&!visited[up]){
                    count++;
                    queue.add(up);
                }else if(down>0&&!visited[down]){
                    count++;
                    queue.add(down);
                }else {
                    System.out.println("use the stairs");
                    return;
                }
            }else{
                int up = now + U;
                int down = now - D;
                if(down>0&&!visited[down]){
                    count++;
                    queue.add(down);
                }else if(up<=F&&!visited[up]){
                    count++;
                    queue.add(up);
                }else {
                    System.out.println("use the stairs");
                    return;
                }
            }
        }
    }
}
