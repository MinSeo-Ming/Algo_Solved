import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N,M,K,min=Integer.MAX_VALUE;
    static char[][] MAP;
    static int[] dx ={-1,1,0,0};
    static int[] dy ={0,0,-1,1};
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," " );
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        MAP = new char[N][M];
        for (int i = 0; i < N; i++) {
             MAP[i] = br.readLine().toCharArray();
            int idx =0;

        }
        BFS(0,0,K);
        if(min==Integer.MAX_VALUE){
            System.out.println(-1);
        }else{
            System.out.println(min);
        }
    }
//    static
    public static void BFS(int x,int y,int k ) {
        boolean[][][] visited = new boolean[N][M][K+1];
        Queue<Load>queue = new LinkedList<>();
        queue.add(new Load(x, y, 0, 1));
        visited[0][0][0] = true;
        while (!queue.isEmpty()){
            Load now = queue.poll();

            int nowWall = now.wall;
            int nowDepth = now.depth;
            int nowX =now.x;
            int nowY =now.y;
            if(nowX==N-1&&nowY==M-1){
                if(nowDepth<min){
                    min =nowDepth;
                }
                return;
            }
            for (int i = 0; i < 4; i++) {
                int temp_x =nowX+dx[i];
                int temp_y = nowY+dy[i];
                if(temp_x<0 ||temp_y<0 ||temp_x>=N || temp_y>=M){
                    continue;
                }
                if(MAP[temp_x][temp_y]=='1'){
                    if(nowWall<K && !visited[temp_x][temp_y][nowWall+1]){
                        queue.add(new Load(temp_x, temp_y, nowWall+1, nowDepth + 1));
                        visited[temp_x][temp_y][nowWall+1]=true;
                    }else{
                        continue;
                    }
                }else{
                    if(!visited[temp_x][temp_y][nowWall]){
                        visited[temp_x][temp_y][nowWall]=true;
                        queue.add(new Load(temp_x, temp_y, nowWall, nowDepth + 1));
                    }
                }
            }
        }
    }
    static class Load{
        int x;
        int y;
        int wall;

        int depth;

        public Load(int x, int y, int wall, int depth) {
            this.x = x;
            this.y = y;
            this.wall = wall;
            this.depth = depth;
        }
    }


}
