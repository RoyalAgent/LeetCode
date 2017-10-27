import java.util.Stack;

public class Main {
    public static int main(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        int i = 0;
        while(i<tokens.length){
            if(tokens[i].equals("+")||tokens[i].equals("-")||tokens[i].equals("*")||tokens[i].equals("/")){
                if(tokens[i].equals("+")){
                    int temp;
                    int a = stack.pop();
                    int b = stack.pop();
                    temp=a+b;
                    stack.push(temp);
                }
                if(tokens[i].equals("-")){
                    int temp;
                    int b = stack.pop();
                    int a = stack.pop();
                    temp=a-b;
                    stack.push(temp);
                }
                if(tokens[i].equals("*")){
                    int temp;
                    int b = stack.pop();
                    int a = stack.pop();
                    temp=a*b;
                    stack.push(temp);
                }
                if(tokens[i].equals("/")){
                    int temp;
                    int b = stack.pop();
                    int a = stack.pop();
                    temp=a/b;
                    stack.push(temp);
                }
            }else{
                stack.push(Integer.parseInt(tokens[i]));
            }
            i++;
        }
        return stack.peek();
    }
}
