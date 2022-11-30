import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;

public class Main {
    static HashMap<Character,Integer> order = new HashMap<>();
    public static void main(String[] args) throws Exception{
        order.put('-',1);
        order.put('+',1);
        order.put('*',2);
        order.put('/',2);
        order.put('(',3);
        order.put(')',3);
        Stack<Character> stack= new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char arr [] = br.readLine().toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char ch:arr) {
            if(Character.isAlphabetic(ch)){
                sb.append(ch);
            }else {
                if(stack.isEmpty()){
                    stack.add(ch);
                }else {
                    if(ch==')'){
                        while (stack.peek()!='('){
                            char pop = stack.pop();
                            sb.append(pop);
                        }
                        stack.pop();
                    }else {
                        if (order.get(stack.peek()) >= order.get(ch)&& ch!='(') {
                            while (stack.peek()!='('&&order.get(stack.peek()) >= order.get(ch)) {
                                char pop = stack.pop();
                                sb.append(pop);
                                if(stack.isEmpty()){
                                    break;
                                }
                            }
                        }
                        stack.add(ch);

                    }
                }
            }
        }
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }
        System.out.println(sb.toString());
    }
}
