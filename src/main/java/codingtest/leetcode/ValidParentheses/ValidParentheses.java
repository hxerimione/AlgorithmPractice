package codingtest.leetcode.ValidParentheses;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid1(String s) {
        String answer = "";
        String[] arr = s.split("");
        for (String str: arr){
            if (str.equals("("))answer +="(";
            else if(str.equals("["))answer+="[";
            else if(str.equals("{"))answer+="{";
            else if(answer.equals("")) return false;
            else if(str.equals(")")){
                if (answer.charAt(answer.length()-1)=='(')answer = answer.substring(0,answer.length()-1);
                else return false;
            }
            else if(str.equals("]")){
                if (answer.charAt(answer.length()-1)=='[')answer = answer.substring(0,answer.length()-1);
                else return false;
            }
            else if(str.equals("}")){
                if (answer.charAt(answer.length()-1)=='{')answer = answer.substring(0,answer.length()-1);
                else return false;
            }
        }
        if(answer.equals("")) return true;
        else return false;
    }
    public boolean isValid2(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
}
