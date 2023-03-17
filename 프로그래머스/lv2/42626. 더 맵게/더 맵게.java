import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>();
        int t;
        for(int i: scoville) q.add(i);
        while (true) {
            if(q.size()<=1 || q.peek()>=K) break;
            t = q.poll() + q.poll() * 2;
            answer++;
            q.add(t);
        }
        if(q.size()<=1&&q.peek()<K)
            answer=-1;
        return answer;
    }
}