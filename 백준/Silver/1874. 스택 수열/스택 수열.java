import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    static int N;
    static int arr[];
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        int index = 0;
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<Integer>();

        while(N-- >0){
            int val = Integer.parseInt(br.readLine());

            if(val > index){
                for(int i= index+1; i<=val; i++){
                    stack.push(i);
                    sb.append("+").append("\n");
                }
                index = val;
            }else if(stack.peek() != val){
                System.out.println("NO");
                return;
            }
            stack.pop();
            sb.append("-").append("\n");
        }
        System.out.println(sb);
    }

}
