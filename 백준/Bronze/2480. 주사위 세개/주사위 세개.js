const fs = require('fs');
let input = fs.readFileSync('/dev/stdin').toString().trim().split(' ').map(Number);
let price = 0;
let result = 3;
let arr = [];

for(let i = 0; i < input.length; i++){
    let sum = 0;
    for(let j = 0; j < input.length; j++){
        if(input[i] === input[j]) sum++;
    }
    if(sum === 3) {
        result = 3;
        break;
    }
    arr.push(sum);
}

if(result === 3){
    price = 10000 + input[0] * 1000;
}

result = arr.sort((a,b) => b - a)[0];
input = input.sort((a,b) => b - a);

if(result === 2){
    price = 1000 + input[1] * 100;
} 

if(result === 1){
    price = input[0] * 100;
}

console.log(price);
