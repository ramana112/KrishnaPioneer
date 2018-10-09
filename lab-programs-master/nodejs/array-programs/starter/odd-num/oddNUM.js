
var oddNum = function(arr){
 console.log("OddNumbers are:");
for(i=0;i<=arr.length-1;i++){
    if(arr[i]%2!=0){
     console.log(arr[i]);
    }
   }
}
module.exports = oddNum ;