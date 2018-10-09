var sort = function (arr){
  
  for(var i=0;i<arr.length;i++){
     for(var j=i+1;j<arr.length;j++){
          if(arr[i]>=arr[j]){
             var temp=arr[i];
             arr[i]=arr[j];
             arr[j]=temp;
           }
      }
  }
    return arr;
 }
var largest_ntharr = function(n){
  var arr=[2,1,3,6,7,3,12,81,13,15,25,3,5];
  var p=sort(arr);
  console.log(p);
  var N=p.length-n;
  console.log("largest Nth element is::",p[N]);
  }
  module.exports = largest_ntharr; 
  





