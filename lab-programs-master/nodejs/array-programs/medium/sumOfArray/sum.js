function sumArray(arr){
    sum=0;
    for(var i=0;i<arr.length;i++){
         sum += arr[i];

    }
    return sum;
}
module.exports = sumArray;