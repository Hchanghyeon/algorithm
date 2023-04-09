function solution(nums) {
    let answer = 0;
    const arr = [];
    for(let i=0; i < nums.length; i++){
        for(let j=i+1; j < nums.length; j++){
            for(let k=j+1; k < nums.length; k++){
                arr.push(nums[i] + nums[j] +nums[k]);
            }
        }
    }
    
    arr.map(item => {
        let count = 0;
        for(let i=2; i < item; i++){
            if(item % i === 0){
                count++;
            }
            if(count > 0){
                break;
            }
        }
        if(count === 0){
            answer++;
        }
    })

    return answer;
}