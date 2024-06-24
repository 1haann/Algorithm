import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();

        while (true) {
            char[] ch = br.readLine().toCharArray();
            if (ch[0] == '.') { // 종료
                break;
            }
            stack.clear();
            Boolean isBalanced = true;

            for (int i = 0; i < ch.length; i++) {
                if (ch[i] == '(' || ch[i] == '[') {
                    stack.push(ch[i]);
                } else if (ch[i] == ')' || ch[i] == ']') {
                    if (!stack.isEmpty() && (ch[i] == ')' && stack.peek() == '(' || ch[i] == ']' && stack.peek() == '[')) {
                        stack.pop();
                    } else {
                        isBalanced = false;
                        break;
                    }
                }
            }
            if (!stack.isEmpty() || !isBalanced) {
                System.out.println("no");
            } else {
                System.out.println("yes");
            }
        }
    }
}
