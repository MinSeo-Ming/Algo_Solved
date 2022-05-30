import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int lt = 1, rt = 1, sum = 1, result = 1;
        while (rt != N) {
            if (sum == N) {
                result++;
                rt++;
                sum += rt;
            } else if (sum > N) {
                sum = sum - lt;
                lt++;
            } else {
                rt++;
                sum += rt;
            }
        }
        System.out.println(result);
    }
}
