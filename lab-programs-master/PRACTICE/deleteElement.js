var arr = [1,5,4,6,7,8,9,6];
function dellete(n1,n2){
    for(i=0;i<arr.length;i++){
    if(arr[i] == n1 ){
        arr.splice(i,1)
    }
    if(arr[i] == n2 ){
        arr.splice(i,1)
    }
}
}
dellete(9,1)
console.log(arr)
console.log(typeof(true))
