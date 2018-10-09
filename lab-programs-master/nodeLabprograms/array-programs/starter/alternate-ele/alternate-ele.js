function alternate(arr){
    for(var i=0;i<arr.length;i++){
        if(i%2==0){
            console.log("The Alternate numbers in an array are",arr[i]);
        }
      }
    }
module.exports = alternate;
