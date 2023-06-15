class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] formula = binomial.split(" ");
        answer = calculate(formula);
        
        return answer;
    }
    
    public int calculate(String[] formula){  
        switch(formula[1]){
            case "+":
                return Integer.parseInt(formula[0]) + Integer.parseInt(formula[2]);
            case "-":
                return Integer.parseInt(formula[0]) - Integer.parseInt(formula[2]);
            case "*":
                return Integer.parseInt(formula[0]) * Integer.parseInt(formula[2]);
        }
        return 0;
    }
}