var romantodecimal_num = function(){
var roman_to_Int = function(str1) {

if(str1 == null) 
    return -1;
    var num = char_to_int(str1.charAt(0));
    var pre_num, curr_num;

    for(var i = 1; i < str1.length; i++){
        curr_num = char_to_int(str1.charAt(i));
        pre_num = char_to_int(str1.charAt(i-1));
        if(curr_num <= pre_num){
        num += curr_num;
        } 
    else {
        num = num - pre*2 + curr_num;
        }
   }
return num;
}

function char_to_int(char){
switch (char){
        case 'I': return 1;
        case 'V': return 5;
        case 'X': return 10;
        case 'L': return 50;
        case 'C': return 100;
        case 'D': return 500;
        case 'M': return 1000;
        default: return -1;
}
}
}
module.exports = romantodecimal_num;