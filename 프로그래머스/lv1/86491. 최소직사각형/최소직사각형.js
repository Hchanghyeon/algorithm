function solution(sizes) {
    const w = [];
    const h = [];
    
    for(let item of sizes){
        if(item[0] > item[1]){
            w.push(item[0]);
            h.push(item[1]);
        } else {
            w.push(item[1]);
            h.push(item[0]);
        }
    }

    return Math.max(...w) * Math.max(...h);
}

