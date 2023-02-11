function solution(x, n) {
    const arr = [];
    let sum = 0;
    for(let i=0; i < n; i++){
        arr.push(sum += x);
    }
    
    return arr;
}