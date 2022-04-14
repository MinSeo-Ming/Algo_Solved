import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());
        System.out.println(m(a%c,b,c));
    }
    static long m(long a,long b,long c){
        if(b==1) return (long) a;
        long temp = m(a,b/2,c)%c;
        if(b%2==0) return (temp *temp)%c;
        else return (((temp *temp)%c)*a)%c;
    }
}
