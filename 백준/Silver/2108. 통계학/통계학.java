import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String args[])throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        int [] input = new int[num];
        for(int i=0; i<num; i++){
            input[i]= Integer.parseInt(bf.readLine());
        }
        bf.close();
        statics(input);
    }
    public static void statics(int[] input){
        int check[] = new int[8001];
        List<Integer> list =new ArrayList<>();
        int max=0;
        Arrays.sort(input);
        int avg,sum=0 ,length = input.length,mid;
        int most,range;
        for(int i=0; i<length; i++){
            check[input[i]+4000]++;
            sum= sum+input[i];
        }
        double temp =((double)sum/(double)length);
        avg= (int) Math.round(temp);
        mid = input[length/2];

        range = input[length-1]-input[0];
        System.out.println(avg);
        System.out.println(mid);
        for(int i=0;i<8001;i++) {
            if(check[i]>=max) {
                max=check[i];
            }
        }
        for(int i=0;i<8001;i++) {
            if(check[i]==max) {
                list.add(i-4000);
            }
        }
        if(list.size()==1) {
            System.out.println(list.get(0));
        }
        else {
            Collections.sort(list);
            System.out.println(list.get(1));
        }
        System.out.println(range);
    }

}
