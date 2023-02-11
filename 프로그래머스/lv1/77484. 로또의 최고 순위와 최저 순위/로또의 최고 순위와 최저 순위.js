function solution(lottos, win_nums) {
    let answer = [];
    let countTwo = 0;
    let dob = [6,6,5,4,3,2,1];
    let count = 0;
    let max = 0;
    let min = 0;
    for(let i=0; i < lottos.length; i++){
        for(let j=0; j < win_nums.length; j++){
            if(lottos[i]==0){
                count++;
                break;
            }else if(win_nums[j] == lottos[i]){
                countTwo++;
            }
        }
    }
    console.log(count + ":" + countTwo);
        
    max = countTwo + count;
    min = countTwo;
    max = dob[max];
    min = dob[min];
    answer.push(max, min);
    
    return answer;
}