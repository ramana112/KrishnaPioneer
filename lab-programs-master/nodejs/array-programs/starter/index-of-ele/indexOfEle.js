function indexOfele(ele){
    console.log("indexOfgivenElement");
    var arr=[1,2,3,4,5,6,7,85,63,44,25,70,71];
        for(i=0;i<=arr.length-1;i++){
            if(ele==arr[i]){
           var index=arr.indexOf(arr[i]);
            }
        }
    return index;
    }
module.exports= indexOfele;
