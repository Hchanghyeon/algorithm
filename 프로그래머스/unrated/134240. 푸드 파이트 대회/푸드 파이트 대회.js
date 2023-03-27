function solution(food) {
    let answer = [];
    let temp = [];
    let share = 0;
    for(let i=1; i < food.length; i++){
        share = Math.floor(food[i] / 2);
        answer.push(i.toString().repeat(share));
    }
    temp = [...answer];
    answer.push('0');
    answer.push(...temp.reverse());
    
    return answer.join('');
}