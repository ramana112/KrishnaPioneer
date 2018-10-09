var fibonacci_series = function (num){
  if (num===1) {
    return [0, 1];
  } 
  else 
  {
    var sum = fibonacci_series(num - 1);
    sum.push(sum[sum.length - 1] + sum[sum.length - 2]);
    return sum;
  }
};
module.exports = fibonacci_series;

 