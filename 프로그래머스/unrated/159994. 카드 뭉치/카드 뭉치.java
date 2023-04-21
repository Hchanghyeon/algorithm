import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> cards1Queue= new LinkedList<String>(Arrays.asList(cards1));
        Queue<String> cards2Queue= new LinkedList<String>(Arrays.asList(cards2));
        String result = "No";
        
        for(int i=0; i < goal.length; i++){
            if(cards1Queue.size() != 0 && cards1Queue.peek().equals(goal[i])){
                cards1Queue.poll();
            } 
            else if(cards2Queue.size() != 0 && cards2Queue.peek().equals(goal[i])){
                cards2Queue.poll();
            } else {
                return "No";
            }
        }
        return "Yes";
    }
}