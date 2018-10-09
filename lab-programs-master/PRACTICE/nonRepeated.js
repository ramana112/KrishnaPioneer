var str = 'college'
for(i=0;i<str.length;i++){
    var c =0;
    for(j=0;j<str.length;j++){
        if(str.charAt(i) == str.charAt(j)){
                c++;
        }else{
        }

    }
    if(c==1){
        console.log(str.charAt(i));
        
    }
}
var name = 'venkat'
console.log(name.split(''))
console.log(name.split('').reverse())
console.log(name.split('').reverse().join(''    ))

var name1 = name.split('').reverse().join();

if(name==name1){
    console.log('palindrome')
}
else{
    console.log('not a palindrome')
}