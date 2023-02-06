const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split(' ');
const chess = [1,1,2,2,2,8];

const result = input.map((item, i) => {
    return chess[i] - parseInt(item);
});

console.log(result.join(' '));
