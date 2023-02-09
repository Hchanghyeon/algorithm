const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');
const time = [];

for(let i=0; i < input.length; i++){
    time.push(input[i].split(' '));
}

let H = Number(time[0][0]);
let M = Number(time[0][1]);
let process = Number(time[1][0]);
let cut = 0;

M += process;

if(M / 60 >= 1){
    cut = Math.floor(M / 60);
    M %= 60;

    H += cut;
    if(H > 23){
        H-=24;
    }
}

console.log(`${H} ${M}`);
