function palindrome(){
    var myString="appa";
    var removeChar = myString.replace(/[^A-Z0-9]/ig, "").toLowerCase();
  
    var checkPalindrome = removeChar.split('').reverse().join('');
    
    if(removeChar === checkPalindrome){
      
      console.log(" The given word is a Palindrome");
    }else{
      
      console.log("The given word is not a Palindrome");
    }
}
module.exports=palindrome;