import java.util.*;
class Solution {
    static Stack<Character> stack = new Stack<>();
    boolean solution(String s) {
        char[] arr = s.toCharArray();
        for(char ch : arr){
            if(ch=='('){
                stack.add('(');
            }else{
                if(stack.isEmpty()){
                    return false;
                }else{
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }

    }
}