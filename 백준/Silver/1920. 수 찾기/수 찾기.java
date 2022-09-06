import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int n,m;
    static int [] arr, map;
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        int index =0;
        while(st.hasMoreTokens()){
            arr[index++] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            boolean find =false;
            int target = Integer.parseInt(st.nextToken());

            int start =0;
            int end = arr.length-1;
            while(start<=end){
                int mid = (start+end)/2;
                int mid_val = arr[mid];
                if(mid_val>target){
                    end = mid -1;
                }else if(mid_val <target){
                    start = mid+1;
                }else{
                    find =true;
                    break;
                }
            }
            if(find){
                System.out.println(1);
            }else {
                System.out.println(0);
            }
        }

    }
}
