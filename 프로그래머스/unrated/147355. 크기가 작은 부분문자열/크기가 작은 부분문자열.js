function solution(t, p) {
    let answer = 0;
    let sliceData = 0;
    
    for(let i = 0; i < t.length; i++){
        sliceData = t.slice(i, i + p.length);
        console.log(sliceData);
        if(sliceData.length >= p.length){
            if(sliceData <= p){
                answer++;
            }
        }
    }
    return answer;
}