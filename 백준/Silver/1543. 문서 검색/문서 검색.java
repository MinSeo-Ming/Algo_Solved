import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String origin = br.readLine();
        String find = br.readLine();

        int len =origin.length();
        int f_len = find.length();

        origin = origin.replace(find,"");
        System.out.println((len-origin.length())/f_len);
    }
}
