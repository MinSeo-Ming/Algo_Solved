

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n,m;
    static int[] data;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int com,a,b;

        data = new int[n+1];
        for (int i = 0; i <=n; i++) {
            data[i]=i;
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            com = Integer.parseInt(st.nextToken());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            if(com==0){
                union(a,b);
            }else {
                if(checkSame(a,b)){
                    System.out.println("YES");
                }else {
                    System.out.println("NO");
                }
            }
        }
    }
    public static int find(int a){
        if(a==data[a]){
            return a;
        }else {
            return data[a]=find(data[a]);
        }
    }
    public static void union(int a,int b){
        a = find(a);
        b = find(b);
        if(a!=b){
            data[b] =a;
        }
    }
    public static boolean checkSame(int a,int b){
        a = find(a);
        b= find(b);
        if(a==b){
            return true;
        }
        return false;
    }
}
