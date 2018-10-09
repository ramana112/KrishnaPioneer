var larnum_smallnum = function (arr){
    var smallnum=0;
    var largenum=0;
    var temp=[];
    for(var i=0;i<arr.length;i++){
    for(var j=i+1;j<arr.length;j++){
         if(arr[i]>=arr[j]){
            var temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
          }
     }
 }
 console.log(smallnum=arr[0]);
 console.log(largenum=arr[arr.length-1]);
}
module.exports = larnum_smallnum;