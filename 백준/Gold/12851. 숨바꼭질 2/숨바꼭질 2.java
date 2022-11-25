import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static  int N,K,min = Integer.MAX_VALUE,max = 100000,cnt=0;
    static boolean visited[] = new boolean[100001];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        BFS(N,0);
        System.out.println(min);
        System.out.println(cnt);
    }
    static void BFS(int now, int time) {
        Queue<SPOT> queue = new LinkedList<>();

        queue.add(new SPOT(now,time));
        while (!queue.isEmpty()){
            SPOT N = queue.poll();
            visited[N.now] =true;
            if(N.now==K){
                if(min>N.time){
                    min = N.time;
                    cnt=1;
                }else if(min == N.time){
                    cnt++;
                }
            }
            //BFS문제는 이렇게 풀기 => 보통 분기 문제들이 그러함.
            if(N.now * 2<=max && !visited[N.now*2]){
                queue.add(new SPOT(N.now*2,N.time+1));
            }
            if(N.now +1<=max && !visited[N.now+1]){
                queue.add(new SPOT(N.now+1,N.time+1));
            }
            if(N.now -1>=0 && !visited[N.now-1]){
                queue.add(new SPOT(N.now-1,N.time+1));
            }

        }
    }
    static class SPOT{
        int now;
        int time;

        public SPOT(int now, int time) {
            this.now = now;
            this.time = time;
        }
    }
}
