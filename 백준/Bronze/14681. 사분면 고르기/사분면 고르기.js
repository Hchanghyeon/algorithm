const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split('\n').map(Number);
const [X, Y] = input;

if(X > 0 && Y > 0) console.log(1);
if(X < 0 && Y > 0) console.log(2);
if(X < 0 && Y < 0) console.log(3);
if(X > 0 && Y < 0) console.log(4);