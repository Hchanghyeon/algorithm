function solution(progresses, speeds) {
    let answer = [];
    let cnt = 0;
    while(progresses.length>0){
        for(let i=0; i < progresses.length; i++){
            progresses[i] += speeds[i];
        }
        cnt=0;
        while(progresses[0] >= 100){
            cnt++;
            progresses.shift();
            speeds.shift();
        }
        if(cnt > 0) answer.push(cnt);
    }
    
    return answer;
}