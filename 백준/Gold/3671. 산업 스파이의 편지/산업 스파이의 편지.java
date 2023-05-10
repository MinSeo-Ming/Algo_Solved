import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    static int N,LIMIT =10000001,S;
    static boolean [] decimal = new boolean[LIMIT],visited;
    static char [] arr;
    static int [] find;
    static HashSet<Integer> set = new HashSet<>();
    public static void main(String[] args) throws Exception {
        decimal[0]=decimal[1]=true;
        for (int i = 2; i <LIMIT ; i++) {
            for (int j = i+i; j <LIMIT ; j+=i) {
                decimal[j]=true;
            }
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        for (int i = 0; i <N; i++) {
            String str = br.readLine();
            arr = str.toCharArray();
            int len = str.length();
            S  = Integer.parseInt(str);
            set = new HashSet<>();
            for (int j = 1; j<=len; j++) {
                visited = new boolean[str.length()];
                find = new int[j];
                count(len,0,j,visited);


            }
            System.out.println(set.size());
        }

    }
    public static void count ( int len,int cnt,int size,boolean []visit){
       if(cnt==size){
           int num =find[0];
           for (int i = 1; i <size ; i++) {
               num *=10;
               num+= find[i];
           }
           if(decimal[num]==false){
               set.add(num);
           }
           return;
       }
        for (int i = 0; i <len ; i++) {
            if(visit[i])continue;
            find[cnt]= arr[i]-'0';
            visit[i]=true;
            count(len,cnt+1,size,visit);
            visit[i]=false;
        }
    }
}