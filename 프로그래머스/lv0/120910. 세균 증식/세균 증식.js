function solution(n, t) {
    let answer = n;
    
    for(let i = 1; i <= t; i++){
        answer = answer*2;
        console.log(i + ':' + answer);
    }
    
    return answer;
}