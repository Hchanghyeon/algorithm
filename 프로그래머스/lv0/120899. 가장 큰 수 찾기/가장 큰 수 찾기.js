function solution(array) {
    let answer = [];
    answer.push(Math.max(...array));
    answer.push(array.indexOf(Math.max(...array)))
    
    return answer;
}