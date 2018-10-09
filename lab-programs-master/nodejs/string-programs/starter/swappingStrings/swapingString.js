var swapingString = function() {
    var str = "html";
    var str2 = "css";
    var temp;
    temp = str;
    str = str2;
    str2 = temp;
  console.log("string one::",str);
  console.log("string two::",str2);
}

module.exports = swapingString;