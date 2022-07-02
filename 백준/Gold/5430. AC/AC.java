import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int repeat = Integer.parseInt(br.readLine());
        StringTokenizer st;
        ArrayDeque<Integer>deque;
        for (int i = 0; i < repeat; i++) {
            char[] order = br.readLine().toCharArray();
            int  len = Integer.parseInt(br.readLine());

            st = new StringTokenizer(br.readLine(), "[],");
            deque= new ArrayDeque<>();
            while (st.hasMoreTokens()){
                deque.add(Integer.parseInt(st.nextToken()));
            }
            AC(order,deque);

        }

        System.out.print(sb.toString());
    }
    public static void AC(char []command, ArrayDeque<Integer>deque){
        boolean flag = true;
        for (char c:command) {
            if(c=='R') {
                flag = !flag;
                continue;
            }
            if(flag){
                if(deque.pollFirst()==null){
                    sb.append("error").append("\n");
                    return;
                }
            }else{
                if(deque.pollLast()==null){
                    sb.append("error").append("\n");
                    return;
                }

            }
        }
        result(deque,flag);

    }
    public static void result(ArrayDeque<Integer>deque,boolean flag){
        sb.append("[");
        if (deque.size()>0){
            if(flag) {
                sb.append(deque.pollFirst());
                while (!deque.isEmpty()) {
                    sb.append(",").append(deque.pollFirst());
                }
            }else {
                sb.append(deque.pollLast());
                while (!deque.isEmpty())
                    sb.append(",").append(deque.pollLast());
            }
        }

        sb.append("]").append("\n");
    }
}
/*
4
RDD
4
[1,2,3,4]
DD
1
[42]
RRD
6
[1,1,2,3,5,8]
D
0
[]

 */