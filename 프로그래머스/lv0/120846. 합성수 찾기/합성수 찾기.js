function solution(n) {
    let answer = 0;
    
    for(let i=4; i <= n; i++){
        let count = 1;
        for(let j=2; j <= i; j++){
            if(i % j === 0){
                count++;
            }
            if(count >= 3){
                answer++;
                break;
            }
        }
    }
    
    return answer;
}