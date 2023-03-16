function solution(n) {
    let answer = 0;
    let sum = 6;
    let count = 1;
    while(sum % n !== 0){
        sum += 6;
        count++;
    }
    
    
    return count;
}