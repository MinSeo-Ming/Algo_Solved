import java.util.*;
import java.io.*;


class Solution {
    public int solution(String s) {
        int answer = s.length();
        int len = s.length();
        int half = len/2;
        
        
        for(int i=1; i<=half ; i++){
            String target = s.substring(0,i);
            String cur = "";
            int cnt =1;
            StringBuilder sb = new StringBuilder();
            for(int j = i; j <= len ; j+=i){
                if(j+i>= len){
                    cur = s.substring(j, len);
                }else{
                    cur = s.substring(j,j+i);
                }
                if(cur.equals(target)){
                    cnt++;
                }else if(cnt==1){
                    sb.append(target);
                    target =cur;
                }else{
                    sb.append(cnt).append(target);
                    target= cur;
                    cnt =1;
                }
            }
            if(i!=target.length()) sb.append(target);
            answer =Math.min(answer,sb.toString().length());
        }
        return answer ;
    }
}