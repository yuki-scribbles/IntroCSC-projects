//Student Name: Trina Dang
//LSU ID: 899459534

package stacks;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Stack;

public class Stacks {
    public static boolean isBalancedExpression(String expression){
        char[] chars = expression.toCharArray();
        Stack<Character> myStack = new Stack<>();
        for(char i:chars){
            if(myStack.size() > 0){
                if(myStack.peek() == '{' & i == '}'){
                    myStack.pop();
                } else
                if(myStack.peek() == '(' & i == ')'){
                    myStack.pop();
                } else {
                    myStack.push(i);
                }
            } else {
                myStack.push(i);
            }    
        }

        if(myStack.size() == 0){
            return (true);
        } else return (false);     
    }
    
    public static int evaluateExpression(String expression){
        String[] split = expression.split(" ");
        Stack<Integer> Nums = new Stack<>();
        for (String i: split){
            if(Character.isDigit(i.charAt(0))){
                int num = Integer.parseInt(i);
                Nums.push(num);
            } else {
                //System.out.println(i);
                if(i.charAt(0) == '+'){
                    Nums.push(Nums.pop() + Nums.pop());
                } else
                if(i.charAt(0) == '-'){
                    Nums.push(-(Nums.pop() - Nums.pop()));
                } else
                if(i.charAt(0) == '*'){
                    Nums.push(Nums.pop() * Nums.pop());
                } else
                if(i.charAt(0) == '/'){
                    int second = Nums.pop();
                    int first = Nums.pop();
                    Nums.push(first/second);              
                }
            }            
        }
        return Nums.peek();
    }
            
    public static void main(String[] args) {
        System.out.println(isBalancedExpression("{}"));
        System.out.println(isBalancedExpression("({({)})}"));
        System.out.println(isBalancedExpression("({})"));
        System.out.println(evaluateExpression("5 4 5 * + 5 /"));
        System.out.println(evaluateExpression("4 5 + 7 2 - *"));
    }
    
}
