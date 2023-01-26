
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    static class Node{
        public int index;
        public int value;
        public Node(int index, int value){
            this.index = index;
            this.value = value;
        }
    }
    static int N, M;
    static int []data,slides;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine()," ");
        Deque<Node> deque = new LinkedList<>();
        for (int j = 0; j < N; j++) {
            int now = Integer.parseInt(st.nextToken());

            while (!deque.isEmpty()&& deque.getLast().value>now){
                deque.removeLast();
            }
            deque.addLast(new Node(j,now));

            if(deque.getFirst().index<= j-M){
                deque.removeFirst();
            }
            bw.write(deque.getFirst().value+" ");
        }
        bw.flush();
        bw.close();
    }
}
