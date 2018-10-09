
var eleRev = function (arr){
    for(i=0;i<=(arr.length-1)/2;i++){
        temp=arr[arr.length-1-i];
        arr[arr.length-1-i]=arr[i];
        arr[i]=temp;
    }
  return arr;
}
module.exports = eleRev ;