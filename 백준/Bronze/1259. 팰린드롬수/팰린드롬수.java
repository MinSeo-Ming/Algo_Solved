import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String s = br.readLine();
            if(s.equals("0")){
                break;
            }
            char arr [] =s.toCharArray();
            int len = arr.length;
            System.out.println(check(arr,len,len/2));


        }
    }
    public static String check(char arr[],int len,int half){
        int left,right;
        if(len%2==0){
            left = half-1;
            right =half;
        }else {
            left = half-1;
            right =half+1;
        }
        while (left>=0 && right<len){
            if(arr[left--]!=arr[right++]){
                return "no";
            }
        }
        return "yes";
    }
}
