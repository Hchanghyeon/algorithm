function solution(strings, n) {
    const table = new Map();
    const alpabetSet = new Set();
    const alpabetArr = [];
    
    for(let item of strings){
        let alpabet = item.split('')[n];
        alpabetSet.add(alpabet);
        if(table.get(alpabet)){
            table.set(alpabet,[item,...table.get(alpabet)])
        } else {
            table.set(alpabet,[item]);
        }
    }
    
    alpabetSet.forEach((item) => alpabetArr.push(item));
    alpabetArr.sort();
    
    const answer = [];
    for(let item of alpabetArr){
        answer.push(...table.get(item).sort());
    }
    
    return answer;
}