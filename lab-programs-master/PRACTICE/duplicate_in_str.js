var str = 'venkataramana';
var x=str.split("");

for(i=0;i<str.length;i++){
let c = 0;
    for(j=0;j<x.length;j++){
        if(str.charAt(i) == x[j] ){
           // console.log(x);
           c++;
        }
    }
     if(c >=1 ){
    console.log(str.charAt(i)+'--'+ c);

    x=x.filter(function (val) {
        
        return val!==str.charAt(i);
    })    
    } 
    }

// var str = 'venkataramana'
// var ob = {}
// for(i=0;i<str.length;i++){
//     if(ob[str.charAt(i)]){
//         ob[str.charAt(i)]++;
//     }else{
//         ob[str.charAt(i)]=1
//     }
// }
// var size = Object.keys(ob).length;
// console.log(ob,'  size  '+size);
