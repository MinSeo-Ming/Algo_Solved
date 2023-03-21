import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static int [] input,parent;
    static char [] origin;
    static Stack<Integer> stack = new Stack<>();
    static int N, X,Y,X_idx,Y_idx,REMOVE;
    static boolean [] visited;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        origin = br.readLine().toCharArray();
        StringTokenizer st = new StringTokenizer(br.readLine());
        X = Integer.parseInt(st.nextToken());
        Y = Integer.parseInt(st.nextToken());
        int size = origin.length;

        input = new int[size+1];
        parent = new int[N+1];
        visited = new boolean[N+1];

        int idx =1;
        for (int i = 0; i <size ; i++) {
            if(origin[i]=='0'){
                if(!stack.isEmpty()) {
                    int peek = stack.peek();
                    parent[idx] = peek;
                }
                stack.add(idx);
                input[i]=idx;
                idx++;
            }else{
                int pop = stack.pop();
                input[i]=pop;
            }
        }
        X_idx = input[X-1];
        Y_idx = input[Y-1];
        findAncestor(X_idx,Y_idx);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= size; i++) {
            if(input[i]==REMOVE)sb.append((i+1)+" ");
        }
        System.out.println(sb.toString());
    }
    static void findAncestor(int x_idx,int y_idx){
        if(x_idx==y_idx){
            REMOVE = x_idx; return;
        }if(visited[x_idx]&&parent[x_idx]!=x_idx){
            REMOVE = x_idx;return;
        }if(visited[y_idx]&&parent[y_idx]!=y_idx){
            REMOVE = y_idx; return;
        }if(parent[x_idx] ==parent[y_idx]){
            REMOVE = parent[x_idx];return;
        }
        visited[x_idx] =true; visited[y_idx]=true;
        findAncestor(parent[x_idx],parent[y_idx] );
    }

}