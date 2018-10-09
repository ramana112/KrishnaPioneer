
var amstrongNum = function(num){
var arm=0;
var lastdigit=0;
temp=num;
while(temp>0){
    lastdigit=temp%10;
    temp=parseInt(temp/10);
    arm = arm+lastdigit*lastdigit*lastdigit;
}
 if(num==arm){
   return "given num is amstrong" + arm;
 }
 else{
     return "given num is not an amstrong"
 }
}
module.exports = amstrongNum;