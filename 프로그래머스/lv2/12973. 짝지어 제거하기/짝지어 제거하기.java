import java.util.*;
class Solution
{
    public int solution(String s)
    {
        int answer = 1;
        Stack<Character> stack = new Stack<Character>();
        char[] strArr = s.toCharArray();
        for(int i=0; i < strArr.length; i++){
            if(stack.size() !=0 && stack.peek().equals(strArr[i])){
                stack.pop();
            } else {
                stack.push(strArr[i]);
            }
        }
        if(stack.size() > 0) answer = 0;
        
        return answer;
    }
}


