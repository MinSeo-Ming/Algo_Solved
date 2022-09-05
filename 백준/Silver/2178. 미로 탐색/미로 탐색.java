import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int [][]map ;
    static int [] dx ={-1,1,0,0};
    static int [] dy ={0,0,-1,1};
    static  int x,y;
    static boolean [][] visited;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());

        map = new int[x][y];
        visited = new boolean[x][y];

        for (int i = 0; i < x; i++) {
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken();
            for (int j = 0; j < y; j++) {
                map[i][j] = Integer.parseInt(line.substring(j,j+1));
            }
        }
        BFS(0,0);
        System.out.println(map[x-1][y-1]);
    }
    static void BFS (int i, int j){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {i,j});
        while (!q.isEmpty()){
            int now[] = q.poll();
            for (int k = 0; k < 4; k++) {
                int nx = now[0] + dx[k];
                int ny = now[1] + dy[k];
                if(nx>=0 && ny>=0&&nx<x&&ny<y){
                    if(!visited[nx][ny]&&map[nx][ny]!=0){
                        visited[nx][ny] =true;
                        map[nx][ny] = map[now[0]][now[1]]+1;
                        q.add(new int[]{nx,ny});
                    }
                }
            }
        }

    }
}
