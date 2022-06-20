import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    static int checkPW=0;
    static int arr[] = new int[4];
    static int check[] = new int[4];
    static char str[];
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        str = br.readLine().toCharArray();
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i <4 ; i++) {
            check[i] = Integer.parseInt(st.nextToken());
            if(check[i]==0)checkPW++;
        }
        
        int answer=0;

        
        for(int i=0; i<P; i++){
            Add(str[i]);
        }
        if(checkPW==4) answer++;


        for (int i = P; i < S; i++) {
            int j = i-P;
            Add(str[i]);
            remove(str[j]);
            if(checkPW==4)answer++;
        }
        System.out.println(answer);
    }
    
    
    static void Add(char c){
        switch (c){
            case 'A':
                arr[0]++;
                if(arr[0]==check[0])checkPW++;
                break;
            case 'C':
                arr[1]++;
                if(arr[1]==check[1])checkPW++;
                break;
            case 'G':
                arr[2]++;
                if(arr[2]==check[2])checkPW++;
                break;
            case 'T':
                arr[3]++;
                if(arr[3]==check[3])checkPW++;
                break;
        }
    }
    static void remove(char c){
        switch (c){
            case 'A':
                if(arr[0]==check[0])checkPW--;
                arr[0]--;
                break;
            case 'C':
                if(arr[1]==check[1])checkPW--;
                arr[1]--;
                break;
            case 'G':
                if(arr[2]==check[2])checkPW--;
                arr[2]--;
                break;
            case 'T':
                if(arr[3]==check[3])checkPW--;
                arr[3]--;
                break;
        }
    }
}
