var des=[];
var sortEle = function (arr){
 for(var i=0;i<arr.length;i++){
    for(var j=i+1;j<arr.length;j++){
         if(arr[i]>=arr[j]){
            var temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
          }
     }
 }
 for(var i=arr.length-1;i>=0;i--){
    des.push(arr[i]);
    }
    console.log(des);
}
module.exports = sortEle;