import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static class Lecture implements Comparable<Lecture>{

        int start;
        int end;

        public int getEnd() {
            return end;
        }

        public Lecture(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Lecture o) {

                return Integer.compare(this.start,o.start);

        }
    }
    static int N ;
    static int MAX = Integer.MIN_VALUE;
    static ArrayList<Lecture> list = new ArrayList<>();
    static PriorityQueue<Integer> pq = new PriorityQueue<>();
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            int srt = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            list.add(new Lecture(srt,end));
        }
        Collections.sort(list);
        for (int i = 0; i < N; i++) {
            while(!pq.isEmpty()&&pq.peek()<=list.get(i).start){
                pq.poll();
            }
            pq.add(list.get(i).end);
            MAX = Math.max(MAX,pq.size());
        }
        System.out.println(MAX);


    }
}
