
var print_ele_left_and_right = function (arr){
    if(arr.length%2!=0){
        var mid=(arr.length-1)/2;
        console.log("The mid element is ",arr[mid]);
    console.log("The left side elements before the mid element");
    for(var i=0;i<arr[mid]-1;i++){
        console.log(arr[i]);
    }
    console.log("The right side elements after the mid element");
    for(var j=arr[mid];j<arr.length;j++){
        console.log(arr[j]);
    }
}
else{
    var mid=(arr.length)/2;
    console.log("The mid element is ",arr[mid]);
    console.log("The left side elements before the mid element");
    for(var i=0;i<arr[mid]-1;i++){
        console.log(arr[i]);
    }
    console.log("The right side elements after the mid element");
    for(var j=arr[mid];j<arr.length;j++){
        console.log(arr[j]);
    }

  }
}
module.exports = print_ele_left_and_right ;