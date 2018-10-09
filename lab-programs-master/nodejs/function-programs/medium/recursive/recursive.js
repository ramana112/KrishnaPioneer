function factorial(n){
 if(n>=1){
    return  n * factorial(n-1);   
 }
 else{
     return 1;
 }
}
var n;
module.exports =factorial;
