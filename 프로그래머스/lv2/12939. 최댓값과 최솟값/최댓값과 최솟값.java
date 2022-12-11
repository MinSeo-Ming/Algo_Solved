import java.util.*;
import java.io.*;
class Solution {
    public String solution(String s) {
        String arr[] = s.split(" ");
        int arr2[] = new int[arr.length];
        int idx =0;
        for(String ch:arr){
            arr2[idx++] =Integer.parseInt(ch);
        }
        Arrays.sort(arr2);
        StringBuilder sb = new StringBuilder();
        sb.append(arr2[0]).append(" ").append(arr2[arr.length-1]);
        return sb.toString();
    }
}