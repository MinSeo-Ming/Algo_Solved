import java.util.Scanner;
import java.math.BigInteger;

public class Main {

    public static void main(String arg[]){
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        BigInteger[][] check =new BigInteger[1001][1001];
        
        for(int i=1; i<=num1; i++){
            for(int j =0; j<=i; j++){
                if(i==j||j==0)
                    check[i][j]= new BigInteger("1");
                else {
                    check[i][j] = (check[i - 1][j - 1] .add(check[i - 1][j]));

                }
            }
        }
        System.out.println(check[num1][num2]);
    }
}
