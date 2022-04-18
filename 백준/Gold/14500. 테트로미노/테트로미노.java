import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int row,col,max = Integer.MIN_VALUE;
    static int [][]map;
    static int [] dx={-1,1,0,0,},dy={0,0,-1,1};
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        row = Integer.parseInt(st.nextToken());
        col = Integer.parseInt(st.nextToken());
        map = new int[row][col];
        boolean [][]visited = new boolean[row][col];

        for (int i = 0; i < row; i++) {
            st = new StringTokenizer(br.readLine()," ");
            for (int j = 0; st.hasMoreTokens(); j++) {
                map[i][j] =Integer.parseInt(st.nextToken());
            }
        }
        br.close();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                visited[i][j]=true;
                dfs(i,j,visited,map[i][j],1);
                visited[i][j]=false;
                block(i,j);
            }
        }
        System.out.println(max);
    }

    private static void dfs(int r, int c, boolean[][] visited, int sum,int level) {
        if(level>=4){
            max = Math.max(max,sum);
            return;
        }
        for (int i = 0; i <4 ; i++) {
            int n_r = r+dx[i];
            int n_c = c+dy[i];

            if(n_c<0||n_r<0||n_r>=row||n_c>=col ||visited[n_r][n_c]) continue;

            visited[n_r][n_c]=true;
            dfs(n_r,n_c,visited,sum+map[n_r][n_c],level+1);
            visited[n_r][n_c]=false;
        }
    }
    static void block(int r,int c){
        if (r < row - 2 && c < col - 1)
            max = Math.max(max, map[r][c] + map[r + 1][c] + map[r + 2][c] + map[r + 1][c + 1]);

        if (r < row - 2 && c > 0)
            max = Math.max(max, map[r][c] + map[r + 1][c] + map[r + 2][c] + map[r + 1][c - 1]);

        if (r < row - 1 && c < col - 2)
            max = Math.max(max, map[r][c] + map[r][c + 1] + map[r][c + 2] + map[r + 1][c + 1]);

        if (r > 0 && c < col - 2)
            max = Math.max(max, map[r][c] + map[r][c + 1] + map[r][c + 2] + map[r - 1][c + 1]);
    }
}
