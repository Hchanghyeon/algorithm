function solution(n) {
    let count = 0;
    let sum = 0;
    let arr = [1];
    for(let i=1; i <= n; i++){
        if(n % i == 0) sum+=i;
    }
    
    return sum;
}