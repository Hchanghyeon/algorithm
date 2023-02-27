function solution(d, budget) {
    let count=0;
    const arr = d.sort((a, b) => (a - b));
    for(let i = 0; i < arr.length; i++){
        budget -= arr[i];
        count++;
        if(budget < 0){
            budget += arr[i];
            count--;
        }
    }
    
    return count;
}