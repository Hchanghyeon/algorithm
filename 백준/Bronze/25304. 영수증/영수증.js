const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');
const arr = [];
let sum = 0;

for(let i=0; i<input.length; i++){
    arr.push(input[i].split(' '));
}

for(let i=2; i<Number(arr[1][0])+2; i++){
    sum = sum + Number(arr[i][0]) * Number(arr[i][1]);
}

sum === Number(arr[0][0]) ? console.log('Yes') : console.log('No')
