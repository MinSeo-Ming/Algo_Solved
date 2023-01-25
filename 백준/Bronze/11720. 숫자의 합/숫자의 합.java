import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[])throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        char []input = s.toCharArray();

        int sum =0;
        for (char c : input) {
            sum += c - '0';
        }
        System.out.println(sum);
    }
}