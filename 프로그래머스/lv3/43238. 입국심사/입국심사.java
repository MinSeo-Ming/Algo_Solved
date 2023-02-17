import java.util.*;
import java.io.*;
class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
        Arrays.sort(times);
        long start =1;
        long end = (long)n *(long) times[times.length -1];
        long sum =0;
        long mid =0;
        while(start<=end){
            sum =0;
            mid = (start+end)/2;
            for(int time: times){
                sum+= mid/time;
            }
                
            if(sum>=n){
                end = mid-1;
                answer = mid;
            }else{
                start = mid+1;
            }
        }
        return answer;
    }
}