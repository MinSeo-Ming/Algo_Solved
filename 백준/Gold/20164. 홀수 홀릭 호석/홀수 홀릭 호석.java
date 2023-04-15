import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static int MIN= Integer.MAX_VALUE,MAX = Integer.MIN_VALUE;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        dfs(input,countOdd(input));
        System.out.println(MIN+" "+MAX);
    }
    public static void dfs(int n, int total){
        if(n<10) {
            MIN = Math.min(MIN, total);
            MAX = Math.max(MAX, total);
        }else{
            String str = Integer.toString(n);
            int len = str.length();
            for (int i = 0; i < len-3; i++) {
                for (int j = i+1; j < len-2 ; j++) {
                    String s1 = str.substring(0,i+1);
                    String s2 = str.substring(i+1,j+1);
                    String s3 = str.substring(j+1,len);
                    int sum = Integer.parseInt(s1) +Integer.parseInt(s2)+Integer.parseInt(s3);
                    dfs(sum,total+countOdd(sum));
                }
            }
        }
    }
    public static int countOdd(int num){
        int count =0;
        while(num>0){
            int cur = num%10;
            if((cur%2)==1)count++;
            num/=10;
        }
        return count;
    }
}
