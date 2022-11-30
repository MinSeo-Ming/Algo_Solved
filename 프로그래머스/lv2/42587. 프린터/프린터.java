import java.util.*;
import java.io.*;
class Solution {
    static HashMap<Integer,Integer> map = new HashMap<>();
    static Queue<Integer> stack = new LinkedList<>();
    public static int solution(int[] priorities, int location) {
        int answer = 0;
        int len = priorities.length;
        for(int i=0; i<len; i++){
            map.put(i,priorities[i]);
            stack.add(i);
        }
        while(true){
            if(stack.isEmpty()) break;
            int max = Collections.max(map.values());
            if(max== map.get(stack.peek())){
                ++answer;
                map.remove(stack.peek());
                if(stack.poll()==location){
                    break;
                }
            }else{
                int pop = stack.poll();
                stack.offer(pop);
            }
        }

        return answer;
    }
}
