
var sumOfDigits = function (num){
var digit = 0;
var sumOfDigits = 0;
while (num != 0){
  digit = num % 10;
  sumOfDigits = sumOfDigits + digit;
  num = num / 10;
 }
 return sumOfDigits;
}
module.exports = sumOfDigits;