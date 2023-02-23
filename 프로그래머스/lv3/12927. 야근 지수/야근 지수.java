import java.util.*;
import java.io.*;
class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int work: works){
            pq.offer(work);
        }
        while(!pq.isEmpty()&&n>0){
            int poll = pq.poll();
            n--;
            if(poll>0){
                pq.offer(--poll);
            }
        }
        while(!pq.isEmpty()){
            answer += (long)Math.pow(pq.poll(),2);
        }
        return answer;
    }
}