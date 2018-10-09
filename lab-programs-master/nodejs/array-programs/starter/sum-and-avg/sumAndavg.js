var sum=0;
function sum_avg(arr){
    for(var i=0;i<arr.length;i++){
        sum+=arr[i];

    }
    return sum;
}
//console.log("Sum of an array elements is",addition);
//var avg=parseInt(addition/arr.length);
//console.log("Average of a given array elements is",avg);
module.exports = sum_avg;
