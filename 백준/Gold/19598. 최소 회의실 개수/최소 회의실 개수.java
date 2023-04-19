import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    static class Conference implements Comparable<Conference>{
        int start;
        int end;

        public int getEnd() {
            return end;
        }

        public Conference(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Conference o) {
            if(this.start==o.start)return this.end -o.end;
            else return this.start - o.start;
        }
    }
    static PriorityQueue<Conference> pq = new PriorityQueue<>(); // 가장 최근에 시작하는 회의
    static PriorityQueue<Conference> list = new PriorityQueue<>(Comparator.comparing(Conference::getEnd)); // 종료 시간 순서대로 회의
    static int count=0;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while(--n >=0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            pq.add(new Conference(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())));
        }
        Cal();
        System.out.println(count);
    }
    static void Cal(){
        // 가장 최근에 시작하는 회의를 pq 에서 꺼내서 list에 넣고
        // 가장 최근에 시작 전에 이미 끝난 회의는 list에서 제거
        // list의 크기를 비교하면 된다..?
        while(!pq.isEmpty()){
            Conference con = pq.poll();
            list.offer(con);
            while(!pq.isEmpty() && pq.peek().start == con.start){//회의 시간이 겹치는 경우 추가
                list.add(pq.poll());
            }
            while(!list.isEmpty()&& list.peek().end <= con.start){// 만약 현재 시작 시간보다 작다면 이미 지난 회의이기에 제거
                list.poll();
            }
            count = Math.max(count,list.size());
        }
    }
}

/*
3
0 10
5 20
15 25


 */