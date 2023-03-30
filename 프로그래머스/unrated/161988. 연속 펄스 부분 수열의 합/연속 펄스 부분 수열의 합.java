import java.util.*;
import java.io.*;
class Solution {
    static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    public long solution(int[] sequence) {
        long result =0;
        
        int len = sequence.length;
        long [] minus =new long[len+1];
        long [] plus = new long[len+1];
        long cal =0;
        for(int i=len-1; i>=0; i--){
            minus [i] = Math.max(-sequence[i],-sequence[i]+plus[i+1]);
            plus [i] = Math.max(sequence[i],sequence[i]+minus[i+1]);
            cal = Math.max(minus[i],plus[i]);
            result =Math.max(cal,result);
        }
        
        return result;
        
        
    }
}