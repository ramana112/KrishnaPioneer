function oddIndex(arr){
console.log("The odd Elements Indexes in the given array are:");
for(i=0;i<=arr.length-1;i++){
    if(arr[i]%2!=0){
     console.log(arr.indexOf(arr[i]));
    }
 }
}
module.exports = oddIndex;