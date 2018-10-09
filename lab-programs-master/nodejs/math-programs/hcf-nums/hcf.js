var HightCommonfactor = function (num1,num2) { 
  var sum = 1
  var num1_divisor = []
  var num2_divisor = []
  for (var i = 1 ; i < num1 ; i++){
     if ( num1 % i == 0 ){
        num1_divisor.push(i)
     }
  }
   for (var i = 1 ; i < num1 ; i++){
     if ( num2 % i == 0 ){
        num2_divisor.push(i)
     }
  }
  for ( var i = 0 ; i < num1_divisor.length ; i++){
        var num1_value = num1_divisor[i]
       for ( var j = 0 ; j < num2_divisor.length ; j++) {
         var num2_value = num2_divisor[j]          
          if (num1_value == num2_value ){
            sum = sum * num2_value;
          }
       }
  }
     return sum
}
module.exports = HightCommonfactor;