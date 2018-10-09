var check_Palindrome = function (str_entry){

    var count = 0;
// Check whether the string is empty or not
	if(str_entry==="") {
		console.log("Enter string");
		return false;
	}
// Check if the length of the string is even or odd 
	if ((str_entry.length) % 2 === 0) {
		count = (str_entry.length) / 2;
	} 
    else {
// If the length of the string is 1 then it becomes a palindrome
		if (str_entry.length === 1) {
		console.log("Entry is a palindrome.");
			return true;
		} 
        else {
// If the length of the string is odd ignore middle character
			count = (str_entry.length - 1) / 2;
		}
	}
// Loop through to check the first character to the last character and then move next
	for (var x = 0; x < count; x++) {
// Compare characters and drop them if they do not match 
		if (str_entry[x] != str_entry.slice(-1-x)[0]) {
		console.log("Entry is not a palindrome.");
			return false;
		}
	  }
console.log("The entry is a palindrome.");
	return true;
}
module.exports = check_Palindrome;