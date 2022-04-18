import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    static boolean [] arr;
    static int cnt,num,sqrt;
    static List<Integer> decimal;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(br.readLine());
        arr = new boolean[num+1];
        arr[0]=true;
        arr[1]=true;

        sqrt=(int) Math.sqrt((double) num);
        for (int i = 2; i <=sqrt ; i++) {
            if(arr[i])continue;
            for (int j = i*i; j <=num; j+=i) {
                arr[j]=true;
            }
        }
        decimal = new ArrayList<Integer>();

        for (int i = 0; i <=num; i++) {
            if(!arr[i]) {
                decimal.add(i);
            }
        }

        cnt =0;
        count(decimal.size());

        System.out.println(cnt);
    }
    static void count(int len){
        int sum =0;
        int lt=0;
        for (int i = 0; i < len; i++) {
            sum +=decimal.get(i);
//            if(sum==num) cnt++;
            while (lt<=len&&sum>=num){
                if(sum==num)cnt++;
                sum-=decimal.get(lt++);
            }
            if(lt>=len)break;
        }
    }
}
