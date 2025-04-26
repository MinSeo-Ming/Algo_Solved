import java.util.*;
import java.io.*;

class Solution {
    char [][] map;
    
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String [n];
        for(int i=0; i<n; i++){
            answer[i]=fillArr(arr1[i],arr2[i],n);  
        }
        return answer;
    }
    public String fillArr(int arr1,int arr2,int n){

        char[] ch1 = String.format("%"+n+"s", Integer.toBinaryString(arr1)).replace(' ','0').toCharArray();
        char[] ch2 = String.format("%"+n+"s", Integer.toBinaryString(arr2)).replace(' ','0').toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int j =0; j<n; j++){
            if(ch1[j]=='1'||ch2[j]=='1'){
                sb.append("#");
            }else{
                sb.append(" ");
            }

        }
    return sb.toString();
    }
}
