import java.util.*;
import java.util.stream.*;

class Solution {
    
    private static final String operandExpression = "\\*|\\-|\\+";
    private static final String operatorExpression = "[0-9]+";
    private static final String[][] operatorPriority = {
        {"*","-","+"},{"*","+","-"},{"+","-","*"},
        {"+","*","-"},{"-","+","*"},{"-","*","+"}
    };
    
    public long solution(String expression) {
        int answer = 0;
        List<String> operands = getOperands(expression);
        List<String> operators = getOperators(expression);
        List<String> formula = getFormula(operands, operators);
        List<Integer> results = new ArrayList<>();
        
        for(int i = 0; i < 6; i++){
            List<String> postfix = toPostfix(formula, i);
            int result = calculate(postfix);
            result = Math.abs(result);
            results.add(result);
        }
        answer = results.stream().mapToInt(Integer::intValue).max().getAsInt();
        return (long)answer;
    }
    
    private List<String> getOperands(String expression){
        String[] operands = expression.split(operandExpression);
        
        return new ArrayList<String>(Arrays.asList(operands));
    }
    
    private List<String> getOperators(String expression){
        String[] operators = expression.split(operatorExpression);
        
        return Arrays.stream(operators)
            .filter(item -> !item.equals(""))
            .collect(Collectors.toList());
    }
    
    private List<String> getFormula(List<String> operands, List<String> operators){
        List<String> formula = new ArrayList<>();
        
        for(int i=0; i < operands.size(); i++){
               formula.add(operands.get(i));
                if(i != operands.size()-1){
                    formula.add(operators.get(i));
                }
        }
        
        return formula;
    }
    
    public List<String> toPostfix(List<String> formula, int i){
        List<String> postfix = new ArrayList<>();
        Deque<String> stack = new ArrayDeque<>();
        
        for(String item : formula){
            switch(item){
                case "*": 
                    pushStack(stack, postfix, item, i);
                    break;
                case "+":
                    pushStack(stack, postfix, item, i);
                    break;
                case "-":
                    pushStack(stack, postfix, item, i);
                    break;
                default: 
                    postfix.add(item);
            }
        }
        
        while(!stack.isEmpty()){
            postfix.add(stack.pop());
        }
            
        return postfix;
    }
    
    private int calculate(List<String> postfix){
        Deque<Integer> stack = new ArrayDeque<>();
        int num1 = 0;
        int num2 = 0;
        int temp = 0;
        
        for(String item : postfix){
            switch(item){
                case "*": 
                    num2 = stack.pop();
                    num1 = stack.pop();
                    temp = num2 * num1;
                     stack.push(temp);
                    break;
                case "+":
                    num2 = stack.pop();
                    num1 = stack.pop();
                    temp = num2 + num1;
                     stack.push(temp);
                    break;
                case "-":
                    num2 = stack.pop();
                    num1 = stack.pop();
                    temp = num2 - num1;
                    stack.push(temp);
                    break;
                default: 
                    stack.push(Integer.parseInt(item));
            }
        }
        
        return stack.pop();
    }
    
    private void pushStack(Deque<String> stack, List<String> postfix, String item, int i){
        if(!stack.isEmpty() && getPriority(stack.peek(), i) >= getPriority(item, i)){
            postfix.add(item);
            stack.pop();
        }
        stack.add(item);
    }
    
    private int getPriority(String operator, int i){
      for(int j = 0; j < operatorPriority[i].length; j++){
          if(operatorPriority[i][j].equals(operator)){
              return j;
          }
      }
        return 1;
    }
    
}