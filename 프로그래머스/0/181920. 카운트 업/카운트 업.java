import java.util.*;
import java.io.*;
class Solution {
    public int[] solution(int start_num, int end_num) {
        ArrayList<Integer> li = new ArrayList<>();
        while (start_num<=end_num){
            li.add(start_num);
            start_num ++;
            
        }
        return li.stream().mapToInt(Integer::intValue).toArray();
    }
}