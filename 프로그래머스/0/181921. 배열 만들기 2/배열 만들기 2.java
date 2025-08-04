import java.util.*;
import java.io.*;
 
class Solution {
    ArrayList<Integer> li = new ArrayList<>();
    ArrayList<Integer> te = new ArrayList<>();
    public int[] solution(int l, int r) {
        int[] answer = {-1};
        int len =0;
        int end =r;
        while(r>0){
            r/=10;
            len ++;
        }
        per(0,"",len,end,l);
        System.out.println(li);
        if(li.size()>0){
            int [] arrrr =li.stream().mapToInt(Integer::intValue).toArray(); 
            return arrrr;
        }else{
            return answer;
        }
    }
    public void per(int idx,String s,int len,int r,int l){
        if(idx==len){
            int num = Integer.parseInt(s);

            if(num >=l && num <=r){
                li.add(num);
            }
        }
        else if(idx<len){
            per(idx+1, s.concat("0"),len,r,l);
            per(idx+1, s.concat("5"),len,r,l);
        }
    }
}