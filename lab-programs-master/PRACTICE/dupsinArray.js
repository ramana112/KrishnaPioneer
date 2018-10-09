var arrstr = ['abc', 'xyz', 'abc','pqr','lmn','pqr','xyz'];


// for(i=0;i<arrstr.length;i++){
// // var j = 0;
// var count=0;
// if(arrstr[0] == arrstr[i]){
//     count++;
//     console.log(arrstr[i]+'--'+count);
//    }    
// }
// arrstr.splice(0,1)

var ob = {}
for(i=0;i<arrstr.length;i++){
    var ele = arrstr[i];
if(ob[ele]){
    ob[ele]++
}else{
    ob[ele] = 1
}
}
console.log(ob);
