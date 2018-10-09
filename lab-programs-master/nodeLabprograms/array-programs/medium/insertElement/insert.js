function insert(element,index){
    var arr=[1,2,4,5,6,7];
    for(var i=0;i<arr.length;i++){
        if(index==i){
         for(j=arr.length;j>=i;j--){
                arr[j]=arr[j-1];
            }
            arr[i]=element;
            console.log(arr);
        }
    }


}
module.exports=insert;