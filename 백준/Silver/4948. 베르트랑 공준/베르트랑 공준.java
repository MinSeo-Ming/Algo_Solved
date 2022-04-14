import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        int num = 1;
        while (true) {
            num = Integer.parseInt(br.readLine());
            if (num == 0) break;
            int cnt = 0;
            int SW = 0;
            for(int i = num + 1; i <= num * 2; i++) {
                int root = (int)Math.sqrt(i) + 1;
                for(int j = 2; j < root; j++) {
                    if(i % j == 0) {
                        SW = 1;
                        break;
                    }
                }
                if(SW == 0) cnt++;
                SW = 0;
            }
            System.out.println(cnt);
        }
    }
}
