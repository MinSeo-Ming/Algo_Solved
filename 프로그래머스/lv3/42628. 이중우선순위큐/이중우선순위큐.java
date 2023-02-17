import java.util.*;
import java.io.*;
class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        StringTokenizer st ;
        PriorityQueue<Integer> pqLow = new PriorityQueue<>(); 
        PriorityQueue<Integer> pqHigh = new PriorityQueue<>(Collections.reverseOrder()); 
        int cnt =0;
        for(String op : operations){
            st = new StringTokenizer(op," ");
            if(st.nextToken().equals("I")){
                int in = Integer.parseInt(st.nextToken());
                pqLow.offer(in);
                pqHigh.offer(in);
                cnt++;
                
            }else{
                if(st.nextToken().equals("-1")){
                    pqHigh.remove(pqLow.poll());
                }else {
                    pqLow.remove(pqHigh.poll());
                }
                cnt--;
            }
        }
        if(cnt<=0){
            return new int[]{0,0};
        }else{
            int low= pqLow.poll();
            int high= pqHigh.poll();
            answer[1] = low <high ? low :high;
            answer[0] = low >=high ? low :high;
            
        }
        
        return answer;
    }
    
}