var tableOf_NUM = function(num){
    var result;
    for(i=1; i<=10; i++) {
      result =  num*i;
	  console.log(i + "x" + num + "=" + result);
    }
    return result;
}
module.exports = tableOf_NUM;