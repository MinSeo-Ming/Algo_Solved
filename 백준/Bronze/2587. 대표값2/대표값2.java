import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static int [] arr = new int[5];
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum =0;
        for (int i = 0; i < 5; i++) {
            arr[i]= Integer.parseInt(br.readLine());
            sum+=arr[i];
        }
        System.out.println(sum/5);
        Arrays.sort(arr);
        System.out.println(arr[2]);
    }
}
