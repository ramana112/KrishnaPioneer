var sumAvg = require("./sumAndavg.js");

var arr=[1,2,3,4,5,6,7,85,63,44,25,70,71];

var res = sumAvg(arr);
var avg = parseInt(res/arr.length);

console.log("The sum of the given array elements is:",res);
console.log("The sum of the given array elements is:",avg);
