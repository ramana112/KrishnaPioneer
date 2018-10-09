function pop(n){
    var arr=[1,4,5,2,6,7,11,33,3];
    for(var i=arr.length-1;i>=0;i--){
        if(arr[i]==n){
            arr.splice(i,1);
        }
    }
  return arr;
}
module.exports = pop;