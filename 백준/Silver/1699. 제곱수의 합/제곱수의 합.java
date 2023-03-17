import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int [] num = new int[100000];
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Arrays.fill(num,Integer.MAX_VALUE);
        int root = (int) (Math.sqrt(100000));
        for(int i=1; i<=root; i++){
            num[i*i] =1;
        }
        num[2]=2;
        num[0]=0;
        num[1]=1;
        num[3]=3;

        for(int i=5; i<=n; i++){
            int half = i/2;
            for (int j = 1; j <=half ; j++) {
                num[i]= Math.min(num[j]+num[i-j],num[i]);
            }
        }
        System.out.println(num[n]);
    }
}
