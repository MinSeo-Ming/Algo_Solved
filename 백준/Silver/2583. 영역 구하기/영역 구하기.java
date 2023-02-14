import java.io.*;
import java.util.*;

public class Main {
    static int [][]map;
    static int M,N,K;
    static boolean[][] visited;
    static int [] dx ={-1,1,0,0}, dy={0,0,-1,1};
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st   = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        map = new int[M][N];
        visited = new boolean[M][N];
        for (int i = 0; i < K; i++) {
            st   = new StringTokenizer(br.readLine());
            int y_1 = Integer.parseInt(st.nextToken());
            int x_1 = M-1- Integer.parseInt(st.nextToken());
            int y_2 = Integer.parseInt(st.nextToken());
            int x_2 = M- Integer.parseInt(st.nextToken());

            for (int j = x_2; j <=x_1 ; j++) {
                for (int k = y_1; k <y_2 ; k++) {
                    map[j][k]=1;
                    visited[j][k]=true;
                }
            }

        }
        ArrayList<Integer> bin = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if(map[i][j]==0&&!visited[i][j]) {
                    int result = bfs(i, j);
                    bin.add(result);
                }
            }
        }
        Collections.sort(bin);
        System.out.println(bin.size());
        for (int result:bin) {
            System.out.print(result+" ");
        }
    }
    static int bfs(int x,int y){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x,y});
        int sum =1;
        visited[x][y]=true;
        while (!q.isEmpty()){
            int [] pop = q.poll();
            for (int i = 0; i < 4; i++) {
                int n_x = pop[0]+dx[i];
                int n_y = pop[1]+dy[i];
                if(n_x>=0&&n_y>=0&&n_x<M && n_y<N){
                    if(!visited[n_x][n_y]&&map[n_x][n_y]==0){
                        visited[n_x][n_y]=true;
                        q.add(new int[]{n_x,n_y});
                        sum++;
                    }
                }
            }
        }
        return sum;
    }
}
