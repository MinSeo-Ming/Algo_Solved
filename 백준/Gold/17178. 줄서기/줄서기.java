import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Stack;

public class Main {
    static class Ticket implements Comparable<Ticket>{
        String ALPHA;
        int NUMBER;

        public Ticket(String  ALPHA, int NUMBER) {
            this.ALPHA = ALPHA;
            this.NUMBER = NUMBER;
        }
        public boolean isSame(Ticket o){
            return this.ALPHA.equals(o.ALPHA)&& this.NUMBER==o.NUMBER;
        }

        @Override
        public int compareTo(Ticket o) {
            if(!this.ALPHA.equals(o.ALPHA)){
                return this.ALPHA.compareTo(o.ALPHA);
            }else{
                return this.NUMBER-o.NUMBER;
            }
        }
    }
    static int N;

    static Stack<Ticket> firstLine =new Stack<>(), waitLine =new Stack<>();
    static String [][] order;
    static boolean finish=false;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        order = new String[N][5];
        Ticket ticket;
        ArrayList<Ticket> waitList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            order[i]= br.readLine().split(" ");
            firstLine = new Stack<>();
            ArrayList<Ticket> list = new ArrayList<>();
            for (int j = 4; j >=0 ; j--) {
                String [] str = order[i][j].split("-");
                Ticket t = new Ticket(str[0],Integer.parseInt(str[1]));
                list.add(t);
                firstLine.add(t);
            }
            Collections.sort(list);

            while (!firstLine.isEmpty()){
                ticket = firstLine.pop();
                while(!waitLine.isEmpty()&&ticket.compareTo(waitLine.peek())>0){
                    int cmp =list.get(0).compareTo(waitLine.peek());
                    if(cmp<0){
                        System.out.println("BAD");
                        return;
                    }
                    Ticket temp =waitLine.pop();
                    waitList.remove(temp);
                }
                if (!ticket.isSame(list.get(0))) {
                    list.remove(ticket);
                    waitLine.add(ticket);
                    waitList.add(ticket);
                } else {
                    list.remove(0);
                }
            }

        }
        Collections.sort(waitList);
        while(!waitLine.isEmpty()){
            ticket = waitLine.pop();
            if(!ticket.isSame(waitList.get(0))){
                System.out.println("BAD");
                return;
            }else{
                waitList.remove(0);
            }
        }


        System.out.println("GOOD");
    }

}
