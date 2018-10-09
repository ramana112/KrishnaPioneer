function copy(arr1,arr2){
    if(arr1.length<=arr2.length){
    for(var i=0;i<=arr1.length-1;i++){
        temp=arr1[i];
        arr1[i]=arr2[i];
        arr2[i]=temp;  
        }
        console.log("arr1 after swap if",arr1);
        console.log("arr2 after swap if",arr2);
    }
    else{
        for(var i=0;i<=arr2.length-1;i++){
            temp=arr1[i];
            arr1[i]=arr2[i];
            arr2[i]=temp;  
            }
            console.log("arr1 after swap else",arr1);
            console.log("arr2 after swap else",arr2);
        }
    
    }
    module.exports =copy;