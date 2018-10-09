var arr=[1,11,3,4,5,6,7,85,63,44,25,70,71];

if(arr.length%2 !== 0){
    m = Math.floor((arr.length/2))    
    console.log('-------first half-----------');
    for(i=0;i<m;i++){
          console.log(arr[i])  
    }  
    console.log('-------Second half-----------');
    for(i=m+1;i<arr.length;i++){
           console.log(arr[i])
        }         
}else{
    console.log('we cant seperate first half and second half');    
}
