  var arthmatic = function(num1,num2,operator){
    var result ;
   switch(operator){
      case '+': result = num1 + num2;
        console.log("addition of two numbers is", result);
      case '-': result = num1 - num2;
        console.log("substraction of two numbers is ", result);
      case '*': result = num1 * num2;
        console.log("multiplication of two numbers is ", result);
      case '/': result = num1 / num2;
         console.log("remainder of two numbers is ", result);
      case '%': result = num1 % num2;
         console.log("quotient of two numbers is ", result);
      default: console.log("Invalid operator");
   }
}
module.exports = arthmatic;