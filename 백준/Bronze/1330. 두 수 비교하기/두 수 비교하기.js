const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split(' ').map(Number);
const [A, B] = input;

if(A > B) console.log(">");
if(A < B) console.log("<");
if(A === B) console.log("==");