import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr[] = new int[N];
        int idx =0;
        while (st.hasMoreTokens()){
            arr[idx++] = Integer.parseInt(st.nextToken());
        }
        int x = Integer.parseInt(br.readLine());
        Arrays.sort(arr);
        int lt =0,rt= arr.length-1, sum=0,answer=0;
        while (lt<rt){
            sum = arr[lt]+arr[rt];
            if(sum==x){
                answer++;
                rt--;
                lt++;
            }else if(sum>x){
                rt--;
            }else if(sum<x){
                lt++;
            }
        }
        System.out.println(answer);

    }
}
/*
1
2
4
 */