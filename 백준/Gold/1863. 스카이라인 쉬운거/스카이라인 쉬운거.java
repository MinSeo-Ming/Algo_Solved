import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static int [] map =new int[50002];
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            map[i]=y;

        }
        int cnt =0;
        for (int i = 0; i <= N; i++) {
            while(!stack.isEmpty()&&stack.peek()>map[i]){
                cnt++;
                stack.pop();
            }
            if(!stack.isEmpty()&&stack.peek()==map[i]) {
                continue;
            }
            stack.add(map[i]);
        }
        System.out.println(cnt);
    }
}

/*
4
1 4
2 3
3 5
4 4

4
1 3
2 2
3 4
4 3
6
1 1
2 2
5 3
6 1
7 3
8 2
 */