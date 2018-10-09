var str = 'venkat';
var c_count = 0
v_count = 0;
for(i=0;i<str.length;i++){
if(str.charAt(i)=='a'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='e'||str.charAt(i)=='i'){
    v_count++
}else{
    c_count++
}
}
console.log('consonents',c_count);
console.log('vowels',v_count);
console.log('----------');

var sentence = 'hi venkat welcome to new world!'
var length = sentence.split('')
console.log(length.length);





