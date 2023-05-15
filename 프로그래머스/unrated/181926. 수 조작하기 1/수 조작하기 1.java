class Solution {
    public int solution(int n, String control) {
        int answer = n;
        
        String[] arr = control.split("");
        for(String character : arr){
            if(character.equals("w")){
                answer += 1;
            } else if(character.equals("s")){
                answer -= 1;
            } else if(character.equals("d")){
                answer += 10;
            } else if(character.equals("a")){
                answer -= 10;
            }
        }
        
        return answer;
    }
}