import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    static List<Integer> plusArr,minusArr;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int repeat = Integer.parseInt(br.readLine());
        plusArr = new ArrayList<>();
        minusArr = new ArrayList<>();
        int one =0;
        for (int i = 0; i < repeat; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num<=0) minusArr.add(num);
            else if(num==1) one++;
            else plusArr.add(num);
        }
        Collections.sort(minusArr);
        Collections.sort(plusArr);

        int minusLen = minusArr.size();
        int plusLen = plusArr.size();

        int minusSum=0, plusSum=0,sum=0;

        for (int i = 0; i <minusLen-1 ; i=i+2) {
            minusSum += minusArr.get(i)*minusArr.get(i+1);
        }
        if(minusLen%2==1)minusSum+=minusArr.get(minusLen-1);

        for (int i = plusLen-1; i >0 ; i=i-2) {
            plusSum += plusArr.get(i)*plusArr.get(i-1);
        }
        if(plusLen%2==1)plusSum+=plusArr.get(0);

        sum = plusSum+minusSum+one;
        System.out.println(sum);

    }
}
