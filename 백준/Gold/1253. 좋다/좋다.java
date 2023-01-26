

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int[]data;
    static int N, left,right,count =0,find;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        data= new int[N];
        int i =0;
        while (st.hasMoreTokens()){
            data[i++]= Integer.parseInt(st.nextToken());
        }

        Arrays.sort(data);


        for (int j = 0; j < N; j++) {
            find = data[j];
            left =0;
            right = N -1;
            out : while (left<right){
                if(data[left]+data[right]==find){
                    if(left!=j && right!=j) {
                        count++;
                        break out;
                    }
                    else if(left == j){
                        left++;
                    }else if(right==j){
                        right--;
                    }
                }else if(data[left]+data[right]<find){
                    left++;
                }else{
                    right--;
                }
            }
        }
        System.out.println(count);
    }
}
/*
10
1 3 4 5 8 9 10 11 16 22
 */