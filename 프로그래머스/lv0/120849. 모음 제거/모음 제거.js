function solution(my_string) {
    const arr = ['a','e','i','o','u'];
    
    const answer = my_string.split('').filter(item => {
        if(!arr.includes(item)){
            return item;
        }
    })
    
    return answer.join('');
}