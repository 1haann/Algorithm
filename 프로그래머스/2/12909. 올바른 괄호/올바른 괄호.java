import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<String> stack = new Stack<>();
        
        for(int i=0;i<s.length();i++) { 
            String input = Character.toString(s.charAt(i));
            // 여는 괄호는 스택에 넣기    
            if(input.equals("(")) {
                stack.push(input);                
            }
            else  { // 닫는 괄호가 나오면 스택에 여는 괄호가 있는 지 확인
                if(!stack.isEmpty() && stack.peek().equals("(")) {  // 닫는 괄호가 있다면 pop
                    stack.pop();
                }
                else {
                    answer = false;
                    break;
                }
            }
        }
        // size가 0이 아닌경우 : 여는 괄호가 닫는 괄호의 개수보다 많은 경우 ( 바르게 짝 지어지지 않음)
        if(stack.size()!=0) {   
            answer = false;
        }
        return answer;
    }
}