function solution(s) {
    const arr = ['zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight', 'nine'];
    let answer = 0;
    while(!Number(s)){
        s = test(arr,s);
    }
    return Number(s);
}

function test(arr, s){
    for(let i=0; i < arr.length; i++){
        s = s.replace(arr[i], i);
    }
    return s
}