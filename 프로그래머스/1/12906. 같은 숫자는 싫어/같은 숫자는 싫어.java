import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        
        stack.push(arr[0]);
        for(int i=1;i<arr.length;i++) {
            if(stack.peek() != arr[i]) {   // stack.peek : stack의 제일 윗 부분의 값을 확인
                stack.push(arr[i]);    
            }
        }
        
        int[] answer = new int[stack.size()];
        for(int i = stack.size()-1;i>=0;i--) {  //stack에서 pop하여 배열 answer의 끝에서부터 채워넣기
            answer[i] = stack.pop();
        }        
        return answer;
    }
}