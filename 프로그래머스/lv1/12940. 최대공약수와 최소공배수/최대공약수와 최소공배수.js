function solution(n, m) {
    let answer = [];
    let nArr = [];
    let mArr = [];
    let result = true;
    
    for(let i=1; i <= m; i++){
        if(i <= n){
            if(n % i === 0){
                nArr.push(i);
            }
        }
        if(m % i === 0){
            mArr.push(i);
        }
    } 
    
    answer.push(Math.max(...mArr.filter((item) => {
        return nArr.includes(item);
    })));
    
    nArr = [];
    mArr = [];
    let i = 1;
    let count = [];
    while(result){
        nArr.push(n*i);
        mArr.push(m*i);
        i++;
        count = mArr.filter((item) => {
            return nArr.includes(item);
        });
        count.length === 1 ? result=false : true
    }
    
    console.log(count);
    answer.push(count.pop());
    
    return answer;
}