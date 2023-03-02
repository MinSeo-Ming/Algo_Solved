import java.util.*;
import java.io.*;

class Solution {
    class Car implements Comparable<Car>{
        int max;
        int min;
        Car(int max, int min){
            this.max = max;
            this.min = min;
        }
        @Override
        public int compareTo(Car o){
            if(o.max- this.max ==0){
                return o.min - this.min;
            }
            return this.max- o.max ;
        }
    }
    public int solution(int[][] routes) {
        int answer = 0;
        int len = routes.length;
        List<int[]> list = new ArrayList<>();
        for(int[] route : routes) {
            list.add(route);
        }
        Collections.sort(list, (a,b) -> a[1] - b[1]);
        while(!list.isEmpty()) {
            int position = list.get(0)[1];

            
            for(int i = 0; i<list.size(); i++ ) {
                if(list.get(i)[0]<=position){
                    list.remove(i);
                    i--;
                } 
            }

            answer++;
        }
        return answer;
    }
    
}