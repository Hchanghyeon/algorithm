function solution(numbers) {
    let answer = [];
    for(let i = 0; i < numbers.length; i++){
        for(let j = 0; j < numbers.length; j++){
            if(i == j){
                continue;
            }
            answer.push(numbers[i] + numbers[j]);
        }
    }    
    answer = Array.from(new Set(answer));
    answer.sort(function(a,b){return a-b});
    return answer;
}