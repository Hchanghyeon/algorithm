const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');
const arr = [];

for(let i=0; i<input.length;i++){
    arr.push(input[i].split(' '));
}

for(let i=1; i<=arr[0][0]; i++){
    console.log(Number(arr[i][0]) + Number(arr[i][1]));
}