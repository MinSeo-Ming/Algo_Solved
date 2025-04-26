import java.util.*;
import java.io.*;
class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int mul = brown + yellow;
        int m = (int)Math.sqrt(mul);
        for(int i =3 ; i<= m; i++){
            if(mul%i==0 &&(i-2)*((mul/i)-2)==yellow ){
                answer[0]=i;
                answer[1]= mul/i;
            }
        }
        if(answer [0]<answer[1]){
            int temp = answer[0];
            answer[0]=answer[1];
            answer[1] =temp;
        }
        return answer;
    }
}