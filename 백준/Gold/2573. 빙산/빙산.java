import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int [][]map, newMap;
    static int dx [] ={-1,1,0,0};
    static int dy [] ={0,0,-1,1};
    static int N,M,count=0,max=0;
    static boolean visited [][];
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
         N = Integer.parseInt(st.nextToken());
         M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        newMap = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine()," ");
            int idx =0;
            while (st.hasMoreTokens()){
                map[i][idx++] = Integer.parseInt(st.nextToken());
            }
            if(max< Arrays.stream(map[i]).max().getAsInt()){
                max = Arrays.stream(map[i]).max().getAsInt();
            }
        }
        int idx =0;
        island();
        if(count>=2){
            System.out.println(0);
            return;
        }
        while (true){
            idx++;
            down();
            island();
            if(count>=2){
                System.out.println(idx);
                return;
            }
            if(max ==0){
                System.out.println(0);
                return;
            }
        }

    }
    public static void dfs (int x,int y) {
        if(x<0 || x>=N ||y<0 || y>=M || map[x][y]==0|| visited[x][y]){
            return;
        }
        visited[x][y]=true;
        for(int i=0; i<4; i++){
            int temp_x = x+dx[i];
            int temp_y = y+dy[i];
            dfs(temp_x,temp_y);
        }
    }

    public static void island(){
        visited = new boolean[N][M];
        count =0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] != 0 && !visited[i][j]) {
                    count++;
                    dfs(i,j);
                }
            }
        }
    }

    public static void down (){
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(map[i][j]!=0){
                    int cnt =0;
                    for (int k = 0; k < 4; k++) {
                        int temp_x = i +dx[k];
                        int temp_y = j +dy[k];
                        if(temp_x>=0 && temp_x<N &&temp_y>=0 && temp_y<M && map[temp_x][temp_y]==0){
                            cnt++;
                        }
                    }
                    if(map[i][j]-cnt >=0) {
                        newMap[i][j] = map[i][j] - cnt;
                    }
                    else {
                        newMap[i][j] =0;
                    }
                }
            }
        }
        int temp_max =0;
        for (int i = 0; i < N; i++) {
            map[i]=newMap[i].clone();
            int line_max =Arrays.stream(map[i]).max().getAsInt();;
            if(temp_max<line_max ){
                temp_max = line_max;
            }
        }
        max = temp_max;

    }
}
