function solution(seoul) {
    let answer=0;
    seoul.map((item, i) => {
        if(item === "Kim") return answer=i;
    })
    
    return `김서방은 ${answer}에 있다`;
}